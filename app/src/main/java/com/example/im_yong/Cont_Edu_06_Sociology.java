package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.SOC;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._s;
import static com.example.im_yong.SubjectInfo._ip;

public class Cont_Edu_06_Sociology {
    static void put_soc() {
        int sc = SOC; //subject code

        SubjectInfo.ps.add(new Piece("교육사회학"));

        _fb(sc, "이론");
        {
            _s();
            _ip("기능론");
            _ip("갈등론");
            _ip("해석적 접근 & 상징적 상호작용");
            _ip("교육과정 사회학");
            _e();
        }
        _fb(sc, "사회변동과 교육");
        {
            _s();
            _ip("학교팽창과 학력상승의 원인");
            _ip("사회발전과 교육");
            _e();
        }
        _fb(sc, "교육과 평등");
        {
            _s();
            _ip("교육의 평등");
            _ip("교육의 사회평등 기여론");
            _ip("교육의 사회불평등 재생산론 & 무효과론");
            _e();
        }
        _fb(sc, "교육선발");
        {
            _s();
            _ip("1");
            _e();
        }
        _fb(sc, "학업성취");
        {
            _s();
            _ip("1");
            _e();
        }
        _fb(sc, "교육개혁");
        {
            _s();
            _ip("1");
            _e();
        }
        _fb(sc, "평생교육");
        {
            _s();
            _ip("성인교육");
            _ip("다문화교육");
            _e();
        }
    }

}
