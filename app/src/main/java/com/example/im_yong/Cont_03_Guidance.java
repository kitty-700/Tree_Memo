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
            _ip("청소년 비행이론");
            {
                _s();
                _ip("아노미 이론","성공 불가능에 대한 좌절감이 비행 유발");
                _ip("차별접촉 이론","일탈행동을 학습");
                _ip("낙인이론","사소한 일탈행위가 비행으로 낙인찍히고 이에 심각한 일탈자로 발전");
                _ip("사회통제이론","사회적 유대가 약화되면 통제력이 약화되고 비행이 발생");
                _e();
            }
            _ip("회복적 생활교육");
            {
                _s();
                _ip("필요성");
                _ip("기본 원리");
                _ip("단계");
                _ip("적용");
                _e();
            }
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
