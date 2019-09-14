package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.EVA;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._ip;
import static com.example.im_yong.SubjectInfo._s;

public class Cont_Edu_02_Evaluation {
    static void put_eva() {
        int sc = EVA; //subject code

        Cont_Detail_Part.insert_into_ps("교육평가 & 교육연구");

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
                _e();
            }
            _ip("교육평가 모형");
            {
                _s();
                _ip("타일러]_ 목표성취 모형");
                _ip("스크리븐]_ 판단모형");
                _ip("스터플빔]_ 의사결정 촉진모형");
                _e();
            }
            _e();
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
            _e();
        }

        _fb(sc, "평가도구의 측정학적 특징");
        {
            _s();
            _ip("타당도", "재려고 하는 것을 충실히 재는 정도");
            {
                _s();
                _ip("내용타당도", "(aka.목표타당도)\n재려는 내용에 대한 타당도");
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
            _ip("객관도", "aka.채점자 신뢰도\n채점의 일관성 정도");
            _e();
        }
        _fb(sc, "교수목표");
        {
            _s();
            _ip(Cont_CC.Bloom_taxonomy);
            _e();
        }
        _fb(sc, "평가문항");
        {
            _s();
            _ip("평가문항 제작");
            {
                _s();
                _ip("선택형 문항");
                {
                    _s();
                    _ip("+");
                    {
                        _s();
                        _ip("채점의 객관성·신뢰성 높음");
                        _ip("내용타당도 높음");
                        _e();
                    }
                    _ip("-");
                    {
                        _s();
                        _ip("단순암기 유도 위험성");
                        _ip("추측 요인 제거 곤란");
                        _ip("표현·창의력 제한");
                        _e();
                    }
                    _ip("선다형 문항");
                    {
                        _s();
                        _ip("+");
                        {
                            _s();
                            _ip("문항난이도 조정 용이");
                            _ip("내용타당도 높음");
                            _e();
                        }
                        _ip("-");
                        {
                            _s();
                            _ip("문항을 잘 만들기 어려움");
                            _e();
                        }
                        _e();
                    }
                    _e();
                }
                _ip("서술형·논술형 문항");
                {
                    _s();
                    _ip("+");
                    {
                        _s();
                        _ip("문항제작 용이");
                        _ip("반응의 자유도가 큼");
                        _e();
                    }
                    _ip("-");
                    {
                        _s();
                        _ip("객관도·신뢰도 낮음", "채점자가 주관적일 수 있으므로");
                        _ip("타당도·신뢰도 낮음", "문항 표본이 적고 시간제한이 있으므로");
                        _ip("채점에 많은 비용");
                        _e();
                    }
                    _e();
                }
                _e();
            }
            _ip("평가문항 분석");
            {
                _s();
                _ip("고전적 검사이론");
                {
                    _s();
                    _ip("문항난이도", "aka. 정답률\n");
                    {
                        _s();
                        _ip("규준지향평가에서", "50% 적당");
                        _ip("목표지향평가에서", "교수-학습의 성공여부 판단 기준\n문항 위계 검증 기준\n(처음엔 난이도 낮고 정답률 높다가...)");
                        _e();
                    }
                    _ip("문항변별도", "피험자의 능력을 변별하는 정도");
                    _ip("문항반응분포", "오답이 얼마나 매력있으며, 정답은 얼마나 정답구실을 했는지의 정도");
                    _e();
                }
                _ip("문항반응이론");
                {
                    _s();
                    _ip("핵심개념", "문항특성곡선");
                    _ip(CC.divide_line);
                    _ip("문항난이도", "aka. 정답률\n");
                    {
                        _s();
                        _e();
                    }
                    _ip("문항변별도", "피험자의 능력을 변별하는 정도");
                    _ip("문항반응분포", "오답이 얼마나 매력있으며, 정답은 얼마나 정답구실을 했는지의 정도");
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "교육통계");
        {
            _s();
            _ip("기초 통계 개념");
            {
                _s();
                _ip("측정치");
                {
                    _s();
                    _ip("명명척도");
                    _ip("서열척도");
                    _ip("등간척도");
                    _ip("비율척도");
                    _e();
                }

                _ip("집중경향치");
                {
                    _s();
                    _ip("중앙치 (Mdn)");
                    _ip("최빈치 (Mo)");
                    _ip("산술평균 (M)");
                    _e();
                }
                _ip("집중경향치 간의 관계");
                {
                    _s();
                    _ip("정적 편포");
                    _ip("정상 분포");
                    _ip("부적 편포");
                    _e();
                }
                _ip("┌ 표준 편차");
                {
                    _s();
                    _ip("");
                    _e();
                }
                _ip("└ 정상분포곡선");
                {
                    _s();
                    _ip("");
                    _e();
                }
                _ip("백분율, 백분위");
                {
                    _s();
                    _ip("");
                    _e();
                }
                _ip("표준 점수");
                {
                    _s();
                    _ip("Z점수", "Z=\n(원점수-평균) / 표준편차");
                    _ip("T점수", "T=\n10 Z + 50");
                    _ip("H점수", "H=\n14 Z + 50");
                    _ip("편차 IQ", "편차 IQ = 15 Z + 100");
                    _ip("스테나인 점수", "스테나인 점수=\n2 Z + 5");
                    _e();
                }
                _e();
            }

            _ip("관계분석을 위한 통계 방법");
            {
                _s();
                _ip("상관분석", "두 변인이 함께 변하는 정도를 분석");
                _ip("변량분석", "독립변인의 둘 이상의 상태가 종속변인에 미치는 영향을 분석");
                {
                    _s();
                    _ip("일원변량분석");
                    _ip("이원변량분석");
                    _ip("공변량분석");
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "교육연구");
        {
            _s();
            _ip("양적연구");
            {
                _s();
                _ip("실험연구");
                {
                    _s();
                    _ip("내적 타당도","가외변인을 얼마나 잘 통제하여 독립변인이 순수하게 종속변인에 영향을 미쳤는지의 정도");
                    {
                        _s();
                        _ip("저해하는 요인");
                        {
                            _s();
                            _ip("역사");
                            _ip("통계적 회귀");
                            _ip("피험자의 성숙");
                            _ip("검사 경험");
                            _ip("도구 사용");
                            _ip("피험자의 차별적 선정");
                            _e();
                        }
                        _ip("높이는 방법");
                        {
                            _s();
                            _ip("무선화");
                            _ip("가외변인 작용의 동일 유지");
                            _ip("독립변인으로 삼기");
                            _e();
                        }
                        _e();
                    }
                    _ip("외적 타당도","실험의 결과를 다른 사태에 일반화시킬 수 있는 정도");
                    {
                        _s();
                        _ip("저해하는 요인");
                        {
                            _s();
                            _ip("호손효과","피험자가 스스로 실험에 참가하고 있다는 사실을 인지하는데서 기인 -> 부자연스러운 행동");
                            _ip("중다처치에 의한 간섭","여러 실험 처치를 받는 경우, 영향 축적");
                            _e();
                        }
                        _e();
                    }
                    _e();
                }
                _ip("실험설계");
                {
                    _s();
                    _ip("진 실험설계","무작위 샘플링 O");
                    {
                        _s();
                        _ip("통제집단 사전사후검사 설계");
                        _ip("사후검사 통제집단 설계");
                        _ip("솔로몬 4개 집단 설계");
                        _e();
                    }
                    _ip("준 실험설계","무작위 샘플링 X");
                    {
                        _s();
                        _ip("단일집단 사후검사 설계");
                        _ip("단일집단 전후검사 설계");
                        _ip("이질집단 사후검사 설계");
                        _ip("이질 통제집단 전후검사 설계");
                        _e();
                    }
                    _e();
                }
                _e();
            }
            _ip("질적연구");
            {
                _s();
                _ip("사례연구");
                _ip("문화기술연구");
                _ip("현장연구");
                _e();
            }
            _e();
        }
    }
}
