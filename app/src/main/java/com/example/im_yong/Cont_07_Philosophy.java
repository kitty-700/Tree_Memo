package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.PHI;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._ip;
import static com.example.im_yong.SubjectInfo._s;

public class Cont_07_Philosophy {
    static void put_phi() {
        int sc = PHI; //subject code

        SubjectInfo.ps.add(new Piece("교육철학"));

        _fb(sc, "1");
        {
            _s();
            _ip("생활지도의 의의");
            _e();
        }

        _fb(sc, "2");
        {
            _s();
            _ip("상담의 기초");
            _e();
        }
    }
}
