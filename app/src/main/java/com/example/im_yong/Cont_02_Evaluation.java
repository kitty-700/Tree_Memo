package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.EVA;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._ip;
import static com.example.im_yong.SubjectInfo._s;

public class Cont_02_Evaluation {
    static void put_eva() {
        int sc = EVA; //subject code

        SubjectInfo.ps.add(new Piece("교육평가 & 교육연구"));

        _fb(sc, "교육평가의 의의");
        {
            _s();
            _ip("교육평가의 개념");
            {
                _s();
                _ip("용어");
                {
                    _s();
                    _ip("측정");
                    _ip("평가");
                    _ip("사정");
                    _e();
                }
                _ip("검사관의 유형");
                {
                    _s();
                    _ip("측정관");
                    _ip("평가관");
                    _ip("총평관");
                    _e();
                }
                _ip("평가관의 유형");
                {
                    _s();
                    _ip("선발적 교육관");
                    _ip("발달적 교육관");
                    _ip("인본주의적 교육관");
                    _e();
                }
            }
            _ip("교육평가 모형");
            {
                _s();
                _ip("타일러]_ 목표성취 모형");
                _ip("스크리븐]_ 판단모형");
                _ip("스터플빔]_ 의사결정 촉진모형");
                _e();
            }
        }

        _fb(sc, "교육평가의 유형");
        {
            _s();
            _ip("참조 준거에 따른");
            {
                _s();
                _ip("규준지향 평가");
                _ip("목표지향 평가");
                _ip("능력지향 평가");
                _ip("성장지향 평가");
                _ip("노력지향 평가");
                _e();
            }
            _ip("평가 시기에 따른");
            {
                _s();
                _ip("진단평가");
                _ip("형성평가");
                _ip("총괄평가");
                _e();
            }
            _ip("수행평가");
            {
                _s();
                _ip("포트폴리오법");
                _e();
            }
            _ip("정의적 특성의 평가");
            {
                _s();
                _ip("태도");
                _ip("가치관");
                _ip("도덕성");
                _ip("학습동기");
                _ip("자아개념");
                _ip("자기효능감");
                _ip("대인관계");
                _e();
            }
        }

        _fb(sc, "평가도구의 측정학적 특징");
        {
            _s();
            _ip("타당도", "재려고 하는 것을 충실히 재는 정도");
            {
                _s();
                _ip("내용타당도 (aka.목표타당도)", "재려는 내용에 대한 타당도");
                _ip("준거타당도");
                {
                    _s();
                    _ip("예언타당도", "준거 : 미래 행동 특성");
                    _ip("공인타당도", "준거 : '새 검사'와 '이미 타당성을 인정받은 검사' 간 유사도");
                    _e();
                }
                _ip("구인타당도", "가설로 정한 심리적 특성에 대한 타당도");
                _e();
            }
            _ip("신뢰도", "오차 없이 정확하게 일관적으로 측정하는 정도");
            _ip("객관도 (aka.채점자 신뢰도)", "채점의 일관성 정도");
            _e();
        }
        _fb(sc, "교수목표와 평가문항의 제작");
        {
            _s();
            _ip(CC.bloom); //new Piece("블룸]_ 교수목표 분류"));
            _ip("평가문항의 제작");
            _ip("문항분석");
            _e();
        }
        _fb(sc, "교육통계");
        {
            _s();
            _ip("기초 통계 개념");
            _ip("관계분석을 위한 통계 방법");
            _e();
        }
        _fb(sc, "교육연구");
        {
            _s();
            _ip("실험연구");
            _ip("실험설계");
            _ip("질적연구");
            _e();
        }
    }
}
