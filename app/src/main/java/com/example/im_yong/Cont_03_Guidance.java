package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.GUI;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._ip;
import static com.example.im_yong.SubjectInfo._s;


public class Cont_03_Guidance {
    static void put_gui() {
        int sc = GUI; //subject code

        SubjectInfo.ps.add(new Piece("생활지도 & 상담"));

        _fb(sc, "생활지도");
        {
            _s();
            _ip("생활지도의 의의");
            _ip("진로지도");
            _e();
        }

        _fb(sc, "상담");
        {
            _s();
            _ip("상담의 기초");
            _ip("상담이론");
            _e();
        }
    }
}
