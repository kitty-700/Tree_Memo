package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.EVA;
import static com.example.im_yong.SubjectInfo.p1;
import static com.example.im_yong.SubjectInfo.p2;
import static com.example.im_yong.SubjectInfo.p3;
import static com.example.im_yong.SubjectInfo.p4;

import static com.example.im_yong.SubjectInfo.ps;

public class Cont_02_Evaluation {
    static void put_eval() {

        SubjectInfo.ps.add(new Piece("교육평가 & 교육연구"));

        ps.get(EVA).put(p1 = new Piece("교육평가의 의의"));
        {
            p1.put(p2 = new Piece("교육평가의 개념"));
            {
                p2.put(p3 = new Piece("용어"));
                {
                    p3.put(p4 = new Piece("측정"));
                    p3.put(p4 = new Piece("평가"));
                    p3.put(p4 = new Piece("사정"));
                }
                p2.put(p3 = new Piece("검사관의 유형"));
                {
                    p3.put(p4 = new Piece("측정관"));
                    p3.put(p4 = new Piece("평가관"));
                    p3.put(p4 = new Piece("총평관"));
                }
                p2.put(p3 = new Piece("평가관의 유형"));
                {
                    p3.put(p4 = new Piece("선발적 교육관"));
                    p3.put(p4 = new Piece("발달적 교육관"));
                    p3.put(p4 = new Piece("인본주의적 교육관"));
                }
            }
            p1.put(p2 = new Piece("교육평가 모형"));
            {
                p2.put(p3 = new Piece("타일러]_ 목표성취 모형"));
                p2.put(p3 = new Piece("스크리븐]_ 판단모형"));
                p2.put(p3 = new Piece("스터플빔]_ 의사결정 촉진모형"));
            }
        }

        ps.get(EVA).put(p1 = new Piece("교육평가의 유형"));
        {
            p1.put(p2 = new Piece("참조 준거에 따른"));
            {
                p2.put(p3 = new Piece("규준지향 평가"));
                p2.put(p3 = new Piece("목표지향 평가"));
                p2.put(p3 = new Piece("능력지향 평가"));
                p2.put(p3 = new Piece("성장지향 평가"));
                p2.put(p3 = new Piece("노력지향 평가"));
            }
            p1.put(p2 = new Piece("평가 시기에 따른"));
            {
                p2.put(p3 = new Piece("진단평가"));
                p2.put(p3 = new Piece("형성평가"));
                p2.put(p3 = new Piece("총괄평가"));
            }
            p1.put(p2 = new Piece("수행평가"));
            {
                p2.put(p3 = new Piece("포트폴리오법"));
            }
            ;
            p1.put(p2 = new Piece("정의적 특성의 평가"));
            {
                p2.put(p3 = new Piece("태도"));
                p2.put(p3 = new Piece("가치관"));
                p2.put(p3 = new Piece("도덕성"));
                p2.put(p3 = new Piece("학습동기"));
                p2.put(p3 = new Piece("자아개념"));
                p2.put(p3 = new Piece("자기효능감"));
                p2.put(p3 = new Piece("대인관계"));
            }
        }

        ps.get(EVA).put(p1 = new Piece("평가도구의 측정학적 특징"));
        {
            p1.put(p2 = new Piece("타당도", "재려고 하는 것을 충실히 재는 정도"));
            {
                p2.put(p3 = new Piece("내용타당도 (aka.목표타당도)","재려는 내용에 대한 타당도"));
                p2.put(p3 = new Piece("준거타당도"));
                {
                    p3.put(p4 = new Piece("예언타당도","준거 : 미래 행동 특성"));
                    p3.put(p4 = new Piece("공인타당도","준거 : '새 검사'와 '이미 타당성을 인정받은 검사' 간 유사도"));
                }
                p2.put(p3 = new Piece("구인타당도","가설로 정한 심리적 특성에 대한 타당도"));
            }

            p1.put(p2 = new Piece("신뢰도","오차 없이 정확하게 일관적으로 측정하는 정도"));
            p1.put(p2 = new Piece("객관도 (aka.채점자 신뢰도)","채점의 일관성 정도"));
        }

        ps.get(EVA).put(p1 = new Piece("교수목표와 평가문항의 제작"));
        {
            p1.put(p2 = CC.bloom); //new Piece("블룸]_ 교수목표 분류"));

            p1.put(p2 = new Piece("평가문항의 제작"));
            p1.put(p2 = new Piece("문항분석"));
        }

        ps.get(EVA).put(p1 = new Piece("교육통계"));
        {
            p1.put(p2 = new Piece("기초 통계 개념"));
            p1.put(p2 = new Piece("관계분석을 위한 통계 방법"));
        }

        ps.get(EVA).put(p1 = new Piece("교육연구"));
        {
            p1.put(p2 = new Piece("실험연구"));
            p1.put(p2 = new Piece("실험설계"));
            p1.put(p2 = new Piece("질적연구"));
        }
    }
}
