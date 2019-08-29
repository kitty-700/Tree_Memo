package com.example.im_yong;

import java.util.ArrayList;

public class SubjectInfo {
    public static ArrayList<Piece> ps = new ArrayList<Piece>(); //pieces
    static Piece pp[] = new Piece[20]; //Piece Pointer. 최대 레벨 20 이지만 여기까지 누가 쓸까?
    static int pi = 0;    //Piece pointer Index

    static Piece p1;    //piece level 1
    static Piece p2;    //piece level 2
    static Piece p3;    //piece level 3 -> 보통 여기부터 윤곽
    static Piece p4;    //piece level 4
    static Piece p5;    //piece level 5
    static Piece p6;    //piece level 6
    static Piece p7;    //piece level 7
    static Piece p8;    //piece level 8
    static final int CUR = 0;
    static final int TEC = 1;
    static final int EVA = 2;
    static final int GUI = 3;
    static final int ADM = 4;
    static final int PSY = 5;
    static final int PHI = 6;
    public static void insp(Piece new_piece){ //insert piece
        pp[pi - 1].put(pp[pi] = new_piece); //부모 (pp[pi-1]) 에 new_piece를 자식 (pp[pi])으로서 넣는다.
    }
    public static void _s(){
        pi++;
    }
    public static void _e(){
        pi--;
    }
    public static void init_informations(){
        Cont_00_Curriculum.put_curriculum();
        Cont_01_Technology.put_engineering();
        Cont_02_Evaluation.put_eval();
        Cont_03_Guidance.put_guide();
        Cont_04_Administration.put_admin();
        put_psy();
    }

/*
        SubjectInfo.ps.add(new Piece("[타이틀0]"));

        ps.get(order).put(p1 = new Piece("[타이틀1]"));
        {
            p1.put(p2 = new Piece("[타이틀2]"));
            {
                p2.put(p3 = new Piece("[타이틀3]"));
                {
                    p3.put(p4 = new Piece("[타이틀4]"));
                    {
                        p4.put(p5 = new Piece("[타이틀5]"));
                        {
                            p5.put(p6 = new Piece("[타이틀6]"));
                            {
                                p6.put(p7 = new Piece("[타이틀7]"));
                            }
                        }
                    }
                }
            }
        }
 */
    static void put_psy() {
        int order = 5;

        SubjectInfo.ps.add(new Piece("교육심리"));

        p1 = new Piece("");
        ps.get(order).put(p1);
        {
            p2 = new Piece("");
            p1.put(p2);
            p2 = new Piece("");
            p1.put(p2);
        }
    }
}
