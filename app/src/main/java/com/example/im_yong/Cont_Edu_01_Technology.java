package com.example.im_yong;

import static com.example.im_yong.Detail_Part.TEC;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._get_above;
import static com.example.im_yong.SubjectInfo._ip;
import static com.example.im_yong.SubjectInfo._s;

public class Cont_Edu_01_Technology {

    static void put_tec() {
        int sc = TEC; //subject code

        Detail_Part.insert_into_ps("교수학습 & 교육공학");

        _fb(sc, "교수학습의 이해");
        {
            _s();
            _ip("학습 & 교수");
            _ip("교수목표 & 수업목표");
            {
                _s();
                _ip("개념");
                _ip("블룸]_ 교수목표 분류");
                {
                    _s();
                    Cont_CC.Bloom_taxonomy = _get_above();
                    _ip("인지적 영역");
                    {
                        _s();
                        _ip("지식", "단순한 기억 & 재생");
                        _ip("이해", "의미 해석 & 추론 & 번역 (표↔사진)");
                        _ip("적용", "개념·원리·절차 사용");
                        _ip("분석", "드러나보이지 않는 관계 파악");
                        _ip("종합", "자료창안");
                        _ip("평가", "내적·외적 준거에 의한 판단");
                        _e();
                    }
                    _ip("정의적 영역");
                    {
                        _s();
                        _ip("감수");
                        _ip("반응");
                        _ip("가치화");
                        _ip("조직화");
                        _ip("인격화");
                        _e();
                    }
                    _ip("심동적 영역");
                    _e();
                }
                _ip("가네]_ 5가지 학습 영역");
                {
                    _s();
                    Cont_CC.Gagne_5_learning_area = _get_above();
                    _ip("언어정보");
                    _ip("지적기능");
                    _ip("인지전략");
                    _ip("운동기능");
                    _ip("태도");
                    _e();
                }
                _e();
            }
            _ip("행동목표 진술 방식", "aka.수업목표\n일차방정식을 풀 수 있다.");
            {
                _s();
                _ip("도착점 행동 진술");
                _ip("행동과 내용 두 측면");
                _ip("구체적 행위동사");
                _e();
            }
            _ip("라이겔루스]_ 처방적 교수이론");
            {
                _s();
                Cont_CC.Reigeluth_ = _get_above();
                _ip("교수의 조건");
                {
                    _s();
                    _ip("교수목표");
                    _ip("학습과제");
                    _ip("학습자 특성");
                    _ip("교수의 외적 환경");
                    _e();
                }
                _ip("교수의 방법");
                {
                    _s();
                    _ip("조직전략");
                    {
                        _s();
                        _ip("거시적");
                        _ip("미시적");
                        _e();
                    }
                    _ip("전달전략");
                    _ip("관리전략");
                    _e();
                }
                _ip("교수의 결과");
                {
                    _s();
                    _ip("효과성", "내용 획득 정도");
                    _ip("효율성", "효과성에 어느정도의 비용을 썼는지");
                    _ip("매력성", "교과 내용에의 흥미 유발");
                    _e();
                }
                _e();
            }
            _e();
        }

        _fb(sc, "전통적 교수이론 및 모형");
        {
            _s();
            _ip("캐롤]_ 학교학습 모형", "학습의 정도학습에 사용된 시간\n" + "-----\n" + "학습에 필요한 시간");
            _ip("스키너]_ 프로그램 학습이론", "학습 부진아 완전학습\n교수 기계");
            _ip("개별화 교수이론");
            {
                _s();
                _ip("적성처치 상호작용 모형 (ATI)", "하나의 수업방식이 모든 학습자에게 효율적인 것은 아님");
                _ip("개별화 교수체제 (PSI)", "스키너의 프로그램학습법을 다인수 학급에 적용");
                _e();
            }
            _ip("오수벨]_ 유의미 교수이론");
            {
                _s();
                _ip("독립 변인 - 유의미한 과제", "실사성\n구속성");
                _ip("매개 변인 - ┌ 기존의 조직된 인지구조", "선행조직자의 도움\n┌ 설명조직자 : 노베이스\n└ 비교조직자 : 베이스 O");
                _ip("매개 변인 - └ 포섭과 동화의 인지과정");
                _ip("종속 변인 - 유의미한 학습", "명제의 전이");
                _e();
            }
            _ip("가네]_ 교수이론");
            {
                _s();
                _ip(Cont_CC.Gagne_5_learning_area); //"가네]_ 학습영역"
                _ip("가네]_ 9가지 수업 사태");
                {
                    _s();
                    _ip("주의집중 시키기");
                    _ip("학습자에게 목표 알려주기");
                    _ip("선수학습의 회생 자극하기");
                    _ip(CC.divide_line);
                    _ip("학습 안내하기");
                    _ip("수행 유도하기");
                    _ip("피드백 제공하기");
                    _ip(CC.divide_line);
                    _ip("성취행동 평가하기");
                    _ip("파지 & 전이 높이기");
                    _e();
                }
                _e();
            }
            _ip("켈러]_ ARCS이론");
            {
                _s();
                _ip("주의", "Attention");
                {
                    _s();
                    _ip("시청각 매체 활용");
                    _ip("비일상적 사건·내용 제시");
                    _ip("문제해결에 필요한 지식 일부분만 제공");
                    _e();
                }
                _ip("관련성", "Relevance");
                {
                    _s();
                    _ip("일상생활 관련");
                    _ip("학습과제의 미래적 가치 제시");
                    _e();
                }
                _ip("자신감", "Confidence");
                {
                    _s();
                    _ip("명확한 평가기준 제시");
                    _ip("적정하고 다양한 수준의 난이도");
                    _ip("선택 기회를 부여하여 통제감 UP");
                    _e();
                }
                _ip("만족감", "Satisfaction");
                {
                    _s();
                    _ip("내적 동기", "평가와 내적 보상");
                    _ip("외적 동기", "강화와 피드백");
                    _e();
                }
                _e();
            }
            _ip(Cont_CC.Reigeluth_);
            _ip("메릴]_ 내용-요소 제시이론");
            {
                _s();
                _ip("내용 차원");
                {
                    _s();
                    _ip("사실");
                    _ip("개념");
                    _ip("절차");
                    _ip("원리");
                    _e();
                }
                _ip("수행 차원");
                {
                    _s();
                    _ip("발견");
                    _ip("활용");
                    _ip("기억");
                    _e();
                }
                _e();
            }
            _e();
        }

        _fb(sc, "학습자 중심 교수모형 - 구성주의");
        {
            _s();
            _ip("구성주의의 의의");
            {
                _s();
                _ip("사회적 상호작용을 통한 지식의 의미 구성");
                _ip("객관주의와의 비교");
                _ip("구성주의 교수설계 원리");
                {
                    _s();
                    _ip("맥락 제공");
                    _ip("실제적 과제 제시");
                    _ip("학습자 중심의 학습환경 설계");
                    _e();
                }
                _e();
            }
            _ip("인지적 도제 교수법");
            {
                _s();
                _ip("모델링");
                _ip("코칭");
                _ip("스캐폴딩");
                _ip("명료화");
                _ip("반성적 사고");
                _ip("탐구");
                _e();
            }
            _ip("상호적 교수");
            _ip("상황학습이론");
            _ip("문제중심학습 (PBL)");
            _ip("스프리오]_ 인지적 유연성 이론");
            _ip("조나센]_ 구성주의 학습환경 설계 모형");
            _ip("자원기반 학습");
            _e();
        }

        _fb(sc, "학습자 중심 교수모형");
        {
            _s();
            _ip("토의·토론 수업");
            _ip("협동학습");
            _ip("협동기술 향상 기법");
            _ip("집단탐구 모형");
            _ip("자율적 협동학습 모형 (Co-op Co-op)");
            _ip("팀 성취분담 학습 (STAD)");
            _ip("팀 보조 개별학습 (TAI)");
            _ip("직소");
            _ip("웹기반 협동학습");
            _ip("문제해결학습 &-> 프로젝트학습");
            _ip("발견학습 & 탐구수업");
            _ip("웹 퀘스트");
            _ip("플립드 러닝");
            _e();
        }

        _fb(sc, "체제적 교수 설계");
        {
            _s();
            _ip("실즈&리치]_ ADDIE 모형");
            _ip("딕&캐리]_ 교수설계 모형");
            _ip("헤이니]_ ASSURE 모형");
            _e();
        }

        _fb(sc, "교육공학");
        {
            _s();
            _ip("데일]_ 시청각교육 이론");
            {
                _s();
                _ip("경험의 원추");
                _e();
            }
            _ip("벨로]_ S-M-C-R 모형");
            _ip("교수매체");
            {
                _s();
                _ip("교수매체의 기능적 특성");
                {
                    _s();
                    _ip("고정성");
                    _ip("조작성");
                    _ip("확충성");
                    _e();
                }
                _ip("교수매체의 효과성 연구");
                {
                    _s();
                    _ip("비교연구");
                    _ip("속성연구");
                    _e();
                }
                _e();
            }
            _e();
        }
    }
}

