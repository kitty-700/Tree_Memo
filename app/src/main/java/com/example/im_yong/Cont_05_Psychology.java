package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.PSY;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._s;
import static com.example.im_yong.SubjectInfo._ip;

public class Cont_05_Psychology {
    static void put_psy() {
        int sc = PSY; //subject code

        SubjectInfo.ps.add(new Piece("교육심리"));

        _fb(sc, "인지발달이론");
        {
            _s();
            _ip("피아제]_");
            _ip("비고츠키]_");
            _e();
        }
        _fb(sc, "정의적 특성의 발달");
        {
            _s();
            _ip("성격");
            _ip("정체성");
            _ip("자아개념");
            _ip("도덕성");
            _e();
        }
        _fb(sc, "학습에 대한 이해","학습이란 어떻게 일어나는 것인가?");
        {
            _s();
            _ip("행동주의 학습이론");
            _ip("사회인지 학습이론");
            _ip("인지주의 학습이론");
            _ip("복잡한 인지과정");
            _e();
        }
        _fb(sc, "학습동기");
        {
            _s();
            _ip("동기의 기초");
            _ip("학습동기 이론들");
            _e();
        }
        _fb(sc, "학습자의 개인적 특성");
        {
            _s();
            _ip("지능이론");
            _ip("지능검사와 그 활용");
            _ip("창의성");
            _ip("인지양식 & 학습양식");
            _e();
        }
    }
}
