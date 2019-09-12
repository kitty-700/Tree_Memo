package com.example.im_yong;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    MainActivity mainActivity;
    ListView listView;
    LinearLayout listViewCover;
    TextView navigator;
    Button memo_btn;
    Button piece_insert_btn;
    EditText piece_input;
    Stack<Piece> pieceStack; //최상위 요소 하나는 있어야하므로 최소 크기가 1임.
    Piece root_piece = new Piece("교육학");
    Piece now_piece;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navigator = (TextView) findViewById(R.id.now_where);
        listView = (ListView) findViewById(R.id.item_list);
        listViewCover = (LinearLayout) findViewById(R.id.item_list_cover);
        memo_btn = (Button) findViewById(R.id.display_memo_btn);
        piece_input = (EditText) findViewById(R.id.item_input);
        piece_insert_btn = (Button) findViewById(R.id.insert_item_btn);
        SubjectInfo.init_static_members();
        SubjectInfo.mainActivity = this;
        //getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN); //키보드 따라서 화면 올라가도록 하기
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
        listViewCover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (is_have_sub_pieces(now_piece) == false) {
                    onBackPressed();
                }
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Piece picked_piece = now_piece.sub_pieces.get(i);
                if (picked_piece.title.equals(CC.divide_line))
                    return;
                String toast_msg = "";
                //마지막일 경우 메세지 띄우기 (근데 일단 띄우는건 보류 후 마지막에 띄움)
                if (is_have_sub_pieces(picked_piece) == false) {
                    toast_msg += "마지막입니다.";
                }
                pieceStack.push(picked_piece);
                now_piece = picked_piece;
                refresh_display();
                //만약 맨 끝단에 내용이 없다면... 심심하니까 메모라도 띄워주자
                if (is_have_sub_pieces(picked_piece) == false) {
                    if (is_have_memo(now_piece)) {
                        display_memo(now_piece);
                    }
                }
                if (!toast_msg.equals("")) {
                    Toast.makeText(mainActivity, toast_msg, Toast.LENGTH_LONG).show();
                }
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
        piece_insert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //별 의미없는 입력이면 무시한다.
                String now_entered = piece_input.getText().toString().trim();
                if (now_entered.equals("")) {
                    piece_input.setText("");
                    return;
                }
                //입력이 끝나면 입력중이던 내용을 지우고 닫는다.
                now_piece.sub_pieces.add(new Piece(now_entered));
                keyboard_kill(piece_input);
                //다시 내용 갱신
                refresh_display();
            }
        });
        refresh_display();
    }

    void keyboard_kill(EditText editText) { //입력중이던 내용을 지우고 닫는다.
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(piece_input.getWindowToken(), 0);
        if (editText != null) {
            editText.setText("");
        }
    }

    void display_memo(Piece picked_piece) {
        if (is_have_memo(picked_piece)) {
            android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(mainActivity);
            builder.setTitle(picked_piece.title);
            builder.setMessage(picked_piece.memo);
            builder.setNegativeButton("OK", null);
            builder.show();
        }
    }

    void refresh_display() {    //now_piece를 가지고 화면 재구성
        //목차 갱신
        String string = "";
        for (int i = 0; i < pieceStack.size(); i++) {
            string += pieceStack.get(i).title + "\n";
            for (int j = 0; j <= i; j++)
                string += "   ";
        }
        navigator.setText(string.trim());

        //ArrayList 갱신
        ArrayList<String> piece_list = new ArrayList<>();
        ArrayList<Piece> sub_pieces = now_piece.sub_pieces;

        if (sub_pieces.size() != 0) {
            //현재 가진 piece들의 정보를 문자열로 만들어 추가한다.
            for (Piece piece : sub_pieces) {
                String str = piece.title;
                int count = piece.sub_pieces.size();
                if (count != 0)
                    str += " [" + count + " / " + piece.children_counting() + "]";

                if (is_have_memo(piece))
                    str += " ++";
                piece_list.add(str);
            }
        }
        if (is_have_memo(now_piece)) {
            memo_btn.setVisibility(View.VISIBLE);
            memo_btn.setText(now_piece.memo);
        } else {
            memo_btn.setVisibility(View.GONE);
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, piece_list);

        listView.setAdapter(adapter);

        listView.setBackgroundColor(Color.parseColor(fill_color()));
    }

    boolean is_have_memo(Piece piece) {
        if (piece.memo != null && piece.memo != "")
            return true;
        return false;
    }

    boolean is_have_sub_pieces(Piece piece) {
        if (piece.sub_pieces.size() != 0)
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
