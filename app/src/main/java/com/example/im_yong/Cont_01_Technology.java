package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.TEC;
import static com.example.im_yong.SubjectInfo.p1;
import static com.example.im_yong.SubjectInfo.p2;
import static com.example.im_yong.SubjectInfo.p3;
import static com.example.im_yong.SubjectInfo.p4;
import static com.example.im_yong.SubjectInfo.p5;
import static com.example.im_yong.SubjectInfo.p6;
import static com.example.im_yong.SubjectInfo.p7;

import static com.example.im_yong.SubjectInfo.ps;

public class Cont_01_Technology {

    static void put_engineering() {
        ps.add(new Piece("교수학습 & 교육공학"));

        ps.get(TEC).put(p1 = new Piece("교수학습의 이해"));
        {
            p1.put(p2 = new Piece("학습 & 교수"));
            p1.put(p2 = new Piece("교수목표 & 수업목표"));
            {
                p2.put(p3 = new Piece("개념"));
                p2.put(p3 = new Piece("블룸]_ 교수목표 분류"));
                {
                    CC.bloom = p3;
                    p3.put(p4 = new Piece("인지적 영역"));
                    {
                        p4.put(p5 = new Piece("지식"));
                        p4.put(p5 = new Piece("이해"));
                        p4.put(p5 = new Piece("적용",
                                "고차적 인지능력"));
                        p4.put(p5 = new Piece("분석",
                                "고차적 인지능력"));
                        p4.put(p5 = new Piece("종합",
                                "고차적 인지능력"));
                        p4.put(p5 = new Piece("평가",
                                "고차적 인지능력"));
                    }
                    p3.put(p4 = new Piece("정의적 영역"));
                    p3.put(p4 = new Piece("심동적 영역"));
                }
                p2.put(p3 = new Piece("5가지 학습 영역", "가네]_"));
                {
                    CC.gagne_area = p3;
                    p3.put(p4 = new Piece("언어정보"));
                    p3.put(p4 = new Piece("지적기능"));
                    p3.put(p4 = new Piece("인지전략"));
                    p3.put(p4 = new Piece("운동기능"));
                    p3.put(p4 = new Piece("태도"));
                }
            }
            p1.put(p2 = new Piece("행동목표 진술 방식 (aka.수업목표)", "일차방정식을 풀 수 있다."));
            {
                p2.put(p3 = new Piece("도착점 행동 진술"));
                p2.put(p3 = new Piece("행동과 내용 두 측면"));
                p2.put(p3 = new Piece("구체적 행위동사"));
            }
            p1.put(p2 = new Piece("라이겔루스]_ 처방적 교수이론"));
            {
                CC.rigelus = p2;
                p2.put(p3 = new Piece("교수의 조건"));
                {
                    p3.put(p4 = new Piece("교수목표"));
                    p3.put(p4 = new Piece("학습과제"));
                    p3.put(p4 = new Piece("학습자 특성"));
                    p3.put(p4 = new Piece("교수의 외적 환경"));
                }
                p2.put(p3 = new Piece("교수의 방법"));
                {
                    p3.put(p4 = new Piece("조직전략","거시적\n미시적"));
                    p3.put(p4 = new Piece("전달전략"));
                    p3.put(p4 = new Piece("관리전략"));
                }
                p2.put(p3 = new Piece("교수의 결과"));
                {
                    p3.put(p4 = new Piece("효과성", "내용 획득 정도"));
                    p3.put(p4 = new Piece("효율성", "효과성에 어느정도의 비용을 썼는지"));
                    p3.put(p4 = new Piece("매력성", "교과 내용에의 흥미 유발"));
                }
            }
        }

        ps.get(TEC).put(p1 = new Piece("전통적 교수이론 및 모형"));
        {
            p1.put(p2 = new Piece("캐롤]_ 학교학습 모형", "학습의 정도학습에 사용된 시간\n" + "-----\n" + "학습에 필요한 시간"));
            p1.put(p2 = new Piece("스키너]_ 프로그램 학습이론", "학습 부진아 완전학습\n교수 기계"));
            p1.put(p2 = new Piece("개별화 교수이론"));
            {
                p2.put(p3 = new Piece("적성처치 상호작용 모형 (ATI)", "하나의 수업방식이 모든 학습자에게 효율적인 것은 아님"));
                p2.put(p3 = new Piece("개별화 교수체제 (PSI)", "스키너의 프로그램학습법을 다인수 학급에 적용"));
            }
            p1.put(p2 = new Piece("오수벨]_ 유의미 교수이론"));
            {
                p2.put(p3 = new Piece("독립 변인 - 유의미한 과제", "실사성\n구속성"));
                p2.put(p3 = new Piece("매개 변인 - ┌ 기존의 조직된 인지구조", "선행조직자의 도움\n┌ 설명조직자 : 노베이스\n└ 비교조직자 : 베이스 O"));
                p2.put(p3 = new Piece("매개 변인 - └ 포섭과 동화의 인지과정"));
                p2.put(p3 = new Piece("종속 변인 - 유의미한 학습", "명제의 전이"));
            }
            p1.put(p2 = new Piece("가네]_ 교수이론"));
            {
                p2.put(p3 = CC.gagne_area); //"가네]_ 학습영역"
                p2.put(p3 = new Piece("9가지 수업 사태"));
                {
                    p3.put(p4 = new Piece("주의집중 시키기"));
                    p3.put(p4 = new Piece("학습자에게 목표 알려주기"));
                    p3.put(p4 = new Piece("선수학습의 회생 자극하기"));
                    p3.put(p4 = new Piece(CC.divide_line));
                    p3.put(p4 = new Piece("학습 안내하기"));
                    p3.put(p4 = new Piece("수행 유도하기"));
                    p3.put(p4 = new Piece("피드백 제공하기"));
                    p3.put(p4 = new Piece(CC.divide_line));
                    p3.put(p4 = new Piece("성취행동 평가하기"));
                    p3.put(p4 = new Piece("파지 & 전이 높이기"));
                }
            }
            p1.put(p2 = new Piece("켈러]_ ARCS이론"));
            {
                p2.put(p3 = new Piece("주의", "Attention"));
                {
                    p3.put(p4 = new Piece("시청각 매체 활용"));
                    p3.put(p4 = new Piece("비일상적 사건·내용 제시"));
                    p3.put(p4 = new Piece("문제해결에 필요한 지식 일부분만 제공"));
                }
                p2.put(p3 = new Piece("관련성", "Relevance"));
                {
                    p3.put(p4 = new Piece("일상생활 관련"));
                    p3.put(p4 = new Piece("학습과제의 미래적 가치 제시"));
                }
                p2.put(p3 = new Piece("자신감", "Confidence"));
                {
                    p3.put(p4 = new Piece("명확한 평가기준 제시"));
                    p3.put(p4 = new Piece("적정하고 다양한 수준의 난이도"));
                    p3.put(p4 = new Piece("선택 기회를 부여하여 통제감 UP"));
                }
                p2.put(p3 = new Piece("만족감", "Satisfaction"));
                {
                    p3.put(p4 = new Piece("내적 동기", "평가와 내적 보상"));
                    p3.put(p4 = new Piece("외적 동기", "강화와 피드백"));
                }
            }
            p1.put(p2 = CC.rigelus);
            p1.put(p2 = new Piece("메릴]_ 내용-요소 제시이론"));
            {
                p2.put(p3 = new Piece("내용 차원"));
                {
                    p3.put(p4 = new Piece("사실"));
                    p3.put(p4 = new Piece("개념"));
                    p3.put(p4 = new Piece("절차"));
                    p3.put(p4 = new Piece("원리"));
                }
                p2.put(p3 = new Piece("수행 차원"));
                {
                    p3.put(p4 = new Piece("발견"));
                    p3.put(p4 = new Piece("활용"));
                    p3.put(p4 = new Piece("기억"));
                }
            }
        }

        ps.get(TEC).put(p1 = new Piece("학습자 중심 교수모형 - 구성주의"));
        {
            p1.put(p2 = new Piece("구성주의의 의의"));
            {
                p2.put(p3 = new Piece("사회적 상호작용을 통한 지식의 의미 구성"));
                p2.put(p3 = new Piece("객관주의와의 비교"));
                p2.put(p3 = new Piece("구성주의 교수설계 원리"));
                {
                    p3.put(p4 = new Piece("맥락 제공"));
                    p3.put(p4 = new Piece("실제적 과제 제시"));
                    p3.put(p4 = new Piece("학습자 중심의 학습환경 설계"));
                }
            }
            p1.put(p2 = new Piece("인지적 도제 교수법"));
            {
                p2.put(p3 = new Piece("모델링"));
                p2.put(p3 = new Piece("코칭"));
                p2.put(p3 = new Piece("스캐폴딩"));
                p2.put(p3 = new Piece("명료화"));
                p2.put(p3 = new Piece("반성적 사고"));
                p2.put(p3 = new Piece("탐구"));
            }
            p1.put(p2 = new Piece("상호적 교수"));
            p1.put(p2 = new Piece("상황학습이론"));
            p1.put(p2 = new Piece("문제중심학습 (PBL)"));
            p1.put(p2 = new Piece("스프리오]_ 인지적 유연성 이론"));
            p1.put(p2 = new Piece("조나센]_ 구성주의 학습환경 설계 모형"));
            p1.put(p2 = new Piece("자원기반 학습"));
        }

        ps.get(TEC).put(p1 = new Piece("학습자 중심 교수모형"));
        {
            p1.put(p2 = new Piece("토의·토론 수업"));
            p1.put(p2 = new Piece("협동학습"));
            p1.put(p2 = new Piece("협동기술 향상 기법"));
            p1.put(p2 = new Piece("집단탐구 모형"));
            p1.put(p2 = new Piece("자율적 협동학습 모형 (Co-op Co-op)"));
            p1.put(p2 = new Piece("팀 성취분담 학습 (STAD)"));
            p1.put(p2 = new Piece("팀 보조 개별학습 (TAI)"));
            p1.put(p2 = new Piece("직소"));
            p1.put(p2 = new Piece("웹기반 협동학습"));
            p1.put(p2 = new Piece("문제해결학습 &-> 프로젝트학습"));
            p1.put(p2 = new Piece("발견학습 & 탐구수업"));
            p1.put(p2 = new Piece("웹 퀘스트"));
            p1.put(p2 = new Piece("플립드 러닝"));
        }

        ps.get(TEC).put(p1 = new Piece("체제적 교수 설계"));
        {
            p1.put(p2 = new Piece("실즈&리치]_ ADDIE 모형"));
            p1.put(p2 = new Piece("딕&캐리]_ 교수설계 모형"));
            p1.put(p2 = new Piece("헤이니]_ ASSURE 모형"));
        }

        ps.get(TEC).put(p1 = new Piece("교육공학"));
        {
            p1.put(p2 = new Piece("데일]_ 시청각교육 이론"));
            {
                p2.put(p3 = new Piece("경험의 원추"));
            }
            p1.put(p2 = new Piece("벨로]_ S-M-C-R 모형"));
            p1.put(p2 = new Piece("교수매체"));
            {
                p2.put(p3 = new Piece("교수매체의 기능적 특성"));
                {
                    p3.put(p4 = new Piece("고정성"));
                    p3.put(p4 = new Piece("조작성"));
                    p3.put(p4 = new Piece("확충성"));
                }
                p2.put(p3 = new Piece("교수매체의 효과성 연구"));
                {
                    p3.put(p4 = new Piece("비교연구"));
                    p3.put(p4 = new Piece("속성연구"));
                }
            }
        }
    }
}

