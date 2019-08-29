package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.GUI;
import static com.example.im_yong.SubjectInfo.p1;
import static com.example.im_yong.SubjectInfo.p2;
import static com.example.im_yong.SubjectInfo.p3;
import static com.example.im_yong.SubjectInfo.p4;
import static com.example.im_yong.SubjectInfo.ps;

public class Cont_03_Guidance {
    static void put_guide() {

        SubjectInfo.ps.add(new Piece("생활지도 & 상담"));

        ps.get(GUI).put(p1 = new Piece("생활지도"));
        {
            p1.put(p2 = new Piece("생활지도의 의의"));
            p1.put(p2 = new Piece("진로지도"));
        }

        ps.get(GUI).put(p1 = new Piece("상담"));
        {
            p2 = new Piece("상담의 기초");
            p1.put(p2);
            p2 = new Piece("상담이론");
            p1.put(p2);
        }
    }
}
