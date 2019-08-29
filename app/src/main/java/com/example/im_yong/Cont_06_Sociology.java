package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.SOC;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._s;
import static com.example.im_yong.SubjectInfo._ip;

public class Cont_06_Sociology {
    static void put_soc() {
        int sc = SOC; //subject code

        SubjectInfo.ps.add(new Piece("교육사회"));

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
