package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.PHI;
import static com.example.im_yong.SubjectInfo.*;


public class Cont_Edu_07_Philosophy {
    static void put_phi() {
        int sc = PHI; //subject code

        Cont_Detail_Part.insert_into_ps("교육철학");

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
