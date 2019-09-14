package com.example.im_yong;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class SubjectInfo {
    static ArrayList<Piece> ps = new ArrayList<Piece>(); //pieces
    static Piece pp[] = new Piece[20]; //Piece Pointer. 최대 레벨 20 이지만 여기까지 누가 쓸까?
    static int pi = 0;    //Piece pointer Index
    static MainActivity mainActivity;
    //////////////////final members
    static final int CUR = 0;
    static final int TEC = 1;
    static final int EVA = 2;
    static final int GUI = 3;
    static final int ADM = 4;
    static final int PSY = 5;
    static final int SOC = 6;
    static final int PHI = 7;

    static void init_static_members() {
        pi = 0;
        mainActivity = null;
        ps = new ArrayList<>();
        pp = new Piece[20];
    }
/*
    int sc = <SUB>; //subject code

    _fb(sc, "타이틀0");
    {
        _s();
        _ip("타이틀2");
        {
            _s();
            _ip("타이틀3");
            _e();
        }
        _e();
    } //-> fb 전까지는 _e(); 해줘야한다.
*/

    public static void _fb(int subject_code, String title, String memo) { //first branch
        ps.get(subject_code).put(pp[pi] = new Piece(title, memo));
    }

    public static void _fb(int subject_code, String title) {
        if (pi != 0) {
            Log.e("kitty", subject_code + " error in " + title);
            if (mainActivity != null)
                Toast.makeText(mainActivity, "데이터 파일에 에러가 있는듯\n" + subject_code + "-" + title, Toast.LENGTH_LONG).show();
        }
        pi = 0;
        _fb(subject_code, title, null);
    }

    public static Piece _get_above() { //get above
        return pp[pi - 1]; //_s() 가 선행되므로 이전 Piece를 지칭하기 위해 pp[pi-1]
    }

    ///////////////////
    public static void _ip(String title, Integer alone, Integer importance, String memo) {//insert piece 목차 항목 넣기
        pp[pi - 1].put(pp[pi] = new Piece(title, alone, importance, memo)); //부모 (pp[pi-1]) 에 new_piece를 자식 (pp[pi])으로서 넣는다.
    }

    public static void _ip(String title, String memo) {
        _ip(title, null, null, memo);
    }

    public static void _ip(String title, Integer alone) {
        _ip(title, alone, null, null);
    }

    public static void _ip(String title, Integer alone, Integer importance) {
        _ip(title, alone, importance, null);
    }

    public static void _ip(String title, Integer alone, String memo) {
        _ip(title, alone, null, memo);
    }

    public static void _ip(String title) {
        _ip(title, null, null, null);
    }

    ///////////////////
    public static void _ip(Piece init_target_piece) { //globalized 된 Piece 를 가져오는 오버로딩함수
        pp[pi - 1].put(pp[pi] = init_target_piece);
    }

    public static void _s() {//start. 목차의 시작
        pi++;
    }

    public static void _e() {//end. 목차의 끝
        pi--;
    }

    public static void init_informations() {
        Cont_Edu_00_Curriculum.put_cur();
        Cont_Edu_01_Technology.put_tec();
        Cont_Edu_02_Evaluation.put_eva();
        Cont_Edu_03_Guidance.put_gui();
        Cont_Edu_04_Administration.put_adm();
        Cont_Edu_05_Psychology.put_psy();
        Cont_Edu_06_Sociology.put_soc();
        Cont_Edu_07_Philosophy.put_phi();
    }
}
