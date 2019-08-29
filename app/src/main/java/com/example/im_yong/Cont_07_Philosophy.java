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

        _fb(sc, "기초");
        {
            _s();
            _ip("교육개념의 정의");
            _ip("교육의 목적");
            _ip("자유교육");
            _ip("교육철학의 개념 & 기능");
            _ip("지식");
            _e();
        }

        _fb(sc, "교육사조");
        {
            _s();
            _ip("실용주의와 듀이의 교육론");
            _ip("20세기 미국의 교육철학");
            _ip("현대의 교육철학");
            _ip("유교의 교육사상");
            _e();
        }
    }
}
