package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.PSY;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._s;
import static com.example.im_yong.SubjectInfo._ip;

public class Cont_Edu_05_Psychology {
    static void put_psy() {
        int sc = PSY; //subject code

        Cont_Detail_Part.insert_into_ps("교육심리");

        _fb(sc, "발달이론");
        {
            _s();
            {
                _s();
                _ip("인지적 특성 발달");
                {
                    _s();
                    _ip("피아제]_");
                    _ip("비고츠키]_");
                    _e();
                }
                _ip("정의적 특성 발달");
                {
                    _s();
                    _ip("성격");
                    _ip("정체성");
                    _ip("자아개념");
                    _ip("도덕성");
                    _e();
                }
                _e();
            }
            _e();
        }

        _fb(sc, "학습이론", "학습이란 어떻게 일어나는 것인가?");
        {
            _s();
            _ip("행동주의 학습이론");
            {
                _s();
                _ip("고전적 조건형성이론");
                {
                    _s();
                    _ip("핵심");
                    {
                        _s();
                        _ip("무조건적 자극");
                        _ip("무조건 반응");
                        _ip("중성 자극");
                        _ip("조건 자극");
                        _ip("조건 반응");
                        _ip("자극의 일반화");
                        _ip("변별");
                        _ip("소거");
                        _ip("자발적 회복 & 재조건 형성");
                        _ip("고차적 조건형성");
                        _e();
                    }
                    _ip("활용");
                    {
                        _s();
                        _ip("수업 등에 긍정적 감정 가지게 하기");
                        _ip("체계적 둔감법");
                        _e();
                    }
                    _e();
                }
                _ip("조작적 조건형성이론");
                {
                    _s();
                    _ip("핵심");
                    {
                        _s();
                        _ip("강화");
                        _ip("벌");
                        _e();
                    }
                    _ip("응용행동분석", "aka. 행동수정 전략");
                    {
                        _s();
                        _ip("기법");
                        {
                            _s();
                            _ip("바람직한 행동을 높이는 기법");
                            _ip("문제 행동을 줄이는 기법");
                            _e();
                        }
                        _e();
                    }
                    _ip("한계", "강화 없이도 학습이 발생");
                    _e();
                }
                _e();
            }
            _ip("사회인지 학습이론");
            _ip("인지주의 학습이론");
            {
                _s();
                _ip("정보처리 모형");
                {
                    _s();
                    _ip("감각기억");
                    _ip("주의");
                    _ip("지각");
                    _ip("작업기억");
                    _ip("부호화");
                    _ip("장기기억");
                    _ip("인출");
                    _e();
                }
                _ip("형태주의");
                _e();
            }
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
