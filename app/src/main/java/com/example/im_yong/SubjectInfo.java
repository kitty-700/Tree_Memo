package com.example.im_yong;

import android.util.Log;

import java.util.ArrayList;

public class SubjectInfo {
    public static ArrayList<Piece> ps = new ArrayList<Piece>(); //pieces
    static Piece pp[] = new Piece[20]; //Piece Pointer. 최대 레벨 20 이지만 여기까지 누가 쓸까?
    static int pi = 0;    //Piece pointer Index

    static final int CUR = 0;
    static final int TEC = 1;
    static final int EVA = 2;
    static final int GUI = 3;
    static final int ADM = 4;
    static final int PSY = 5;
    static final int SOC = 6;
    static final int PHI = 7;
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
        _fb(subject_code, title, null);
    }

    public static Piece _get_above() { //get above
        return pp[pi - 1]; //_s() 가 선행되므로 이전 Piece를 지칭하기 위해 pp[pi-1]
    }


    public static void _ip(String title, String memo) { //insert piece 목차 항목 넣기
        pp[pi - 1].put(pp[pi] = new Piece(title, memo)); //부모 (pp[pi-1]) 에 new_piece를 자식 (pp[pi])으로서 넣는다.
    }

    public static void _ip(String title) {
        _ip(title, null);
    }

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
        Cont_00_Curriculum.put_cur();
        if(pi!=0)
            Log.e("Kitty","Cont_01_Technology 에러");

        Cont_01_Technology.put_tec();
        if(pi!=0)
            Log.e("Kitty","Cont_01_Technology 에러");

        Cont_02_Evaluation.put_eva();
        if(pi!=0)
            Log.e("Kitty","Cont_02_Evaluation 에러");

        Cont_03_Guidance.put_gui();
        if(pi!=0)
            Log.e("Kitty","Cont_03_Guidance 에러");

        Cont_04_Administration.put_adm();
        if(pi!=0)
            Log.e("Kitty","Cont_04_Administration 에러");

        Cont_05_Psychology.put_psy();
        if(pi!=0)
            Log.e("Kitty","Cont_05_Psychology 에러");

        Cont_06_Sociology.put_soc();
        if(pi!=0)
            Log.e("Kitty","Cont_06_Sociology 에러");

        Cont_07_Philosophy.put_phi();
        if(pi!=0)
            Log.e("Kitty","Cont_07_Philosophy 에러");

    }

}
