package com.example.im_yong;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    MainActivity mainActivity;
    ListView listView;
    TextView textView;
    Button memo_btn;
    Stack<Piece> pieceStack; //최상위 요소 하나는 있어야하므로 최소 크기가 1임.
    Piece root_piece = new Piece("교육학");
    Piece now_piece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.now_where);
        listView = (ListView) findViewById(R.id.list);
        memo_btn = (Button) findViewById(R.id.display_memo_btn);

        setTitle("Kitty 임용");
        pieceStack = new Stack<Piece>();
        mainActivity = this;
        Initializer.initialize(root_piece);
        pieceStack.push(root_piece);
        now_piece = root_piece;
        memo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (is_have_memo(now_piece))
                    display_memo(now_piece);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Piece picked_piece = now_piece.sub_pieces.get(i);
                if (picked_piece.sub_pieces.size() == 0) {
                    if (is_have_memo(picked_piece))
                        display_memo(picked_piece);
                    else
                        Toast.makeText(mainActivity, "현재 내용이 없습니다.", Toast.LENGTH_LONG).show();
                    return;
                }
                pieceStack.push(picked_piece);
                now_piece = picked_piece;

                refresh_display();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
                                           int i, long l) {
                Piece picked_piece = now_piece.sub_pieces.get(i);
                display_memo(picked_piece);
                return true;
            }
        });
        refresh_display();
    }

    void display_memo(Piece picked_piece) {
        if (is_have_memo(picked_piece)) {
            android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(mainActivity);
            builder.setTitle(picked_piece.name);
            builder.setMessage(picked_piece.memo);
            builder.setNegativeButton("OK", null);
            builder.show();
        }
    }

    void refresh_display() {    //now_piece를 가지고 화면 재구성
        //목차 갱신
        String string = "";
        for (int i = 0; i < pieceStack.size(); i++) {
            string += pieceStack.get(i).name + "\n";
            for (int j = 0; j <= i; j++)
                string += "   ";
        }
        textView.setText(string.trim());

        //ArrayList 갱신
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Piece> sub_pieces = now_piece.sub_pieces;

        if (sub_pieces.size() == 0) {
            Toast.makeText(mainActivity, "현재 내용이 없습니다.", Toast.LENGTH_LONG).show();
        } else {
            for (Piece piece : sub_pieces) {
                String child_counted_str = piece.name;
                int count = piece.sub_pieces.size();
                if (count != 0)
                    child_counted_str += " [" + count + " / " + piece.children_count() + "]";

                if (is_have_memo(piece))
                    child_counted_str += " ++";
                list.add(child_counted_str);
            }
        }
        memo_btn.setVisibility( is_have_memo(now_piece) ? View.VISIBLE : View.INVISIBLE );


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        listView.setAdapter(adapter);

        listView.setBackgroundColor(Color.parseColor(fill_color()));
    }

    boolean is_have_memo(Piece piece) {
        if (piece.memo != null && piece.memo != "")
            return true;
        return false;
    }

    String fill_color() {   //Listview 배경 채우기
        String red_color_code = "FF0000";
        String color = "FF0000";
        int step = 8; //Depth 가 깊어질 때마다 얼마나 배경이 진해질지를 결정
        int max_concentration = 130;
        int s_sz = pieceStack.size(); //stack size
        if (s_sz <= 0 || s_sz >= 16)
            color = "#" + String.format("%02x", 0) + red_color_code;
        else {
            s_sz = s_sz * step;
            if (s_sz >= max_concentration)
                s_sz = max_concentration;
            color = "#" + String.format("%02x", s_sz) + red_color_code;
        }
        return color;
    }

    @Override
    public void onBackPressed() {
        if (pieceStack.size() == 1) {
            display_exit_msg();
        } else {
            //스택을 쌓다보면 스택의 최상단이 now_piece와 같아진다.
            // 이 경우, 뒤로가기를 누르면 방금 전의 piece가 화면에 출력되는데,
            // 이를 보완하기 위해 조건을 따로 두었음.
            if (pieceStack.peek() == now_piece) {
                pieceStack.pop();
                now_piece = pieceStack.peek();
            } else {
                now_piece = pieceStack.pop();
            }
            refresh_display();
        }
    }

    void display_exit_msg() {
        AlertDialog.Builder alert = new AlertDialog.Builder(mainActivity);
        alert.setPositiveButton("종료", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                mainActivity.finish();
            }
        });
        alert.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert.setMessage("최상위 메뉴입니다.\n종료하시겠습니까?");
        alert.show();
    }
}
