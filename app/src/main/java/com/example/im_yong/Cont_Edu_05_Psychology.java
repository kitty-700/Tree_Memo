package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.PSY;
import static com.example.im_yong.SubjectInfo.*;


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
                    {
                        _s();
                        _ip("프로이드]_ 심리 성적 성격발달이론",true,"원시자아에서 나온 성적 에너지인 리비도");
                        {
                            _s();
                            _ip("구강기");
                            _ip("항문기");
                            _ip("남근기");
                            _ip("잠재기");
                            _ip("생식기");
                            _e();
                        }
                        _ip("에릭슨]_ 사회심리적 성격발달이론",true,"개인의 욕구와 사회문화적인 요인의 상호작용으로 성격 발달");
                        {
                            _s();
                            _ip("유아기　　 : 기본적 신뢰감 vs 불신감");
                            _ip("유아기　　 : 자율성 vs 수치심");
                            _ip("취학전기　 : 주도성 vs 죄책감");
                            _ip("초등학교기 : 근면성 vs 열등감");
                            _ip("청소년기　 : 자아정체감, 역할혼미, 심리적 유예");
                            _ip("성인기　　 : 친밀감 대 고립감");
                            _ip("장년기　　 : 생산성 대 침체");
                            _ip("노년기　　 : 자아통합 대 절망");
                            _e();
                        }
                        _e();
                    }
                    _ip("정체성");
                    {
                        _s();
                        _ip("마샤]_ 정체감 상태",true,"탐색과 헌신 두 요인이 정체감 상태 결정");
                        _e();
                    }
                    _ip("자아개념");
                    _ip("도덕성");
                    {
                        _s();
                        _ip("피아제]_ 도덕성 발달이론", true);
                        {
                            _s();
                            _ip("1. 자율적 도덕성 단계");
                            _ip("2. 타자율적 도덕성 단계");
                            _e();
                        }
                        _ip("콜버그]_ 도덕성 발달이론", true);
                        {
                            _s();
                            _ip("1. 전인습적 도덕성 단계");
                            _ip("2. 인습적 도덕성 단계");
                            _ip("3. 후인습적 도덕성 단계");
                            _e();
                        }
                        _ip("셀만]_ 조망수용 단계", true,7,"조망수용능력 : 다른 사람의 관점에서 이해하는 능력");
                        {
                            _s();
                            _ip("1. ");
                            _ip("2. ");
                            _ip("3. ");
                            _ip("4. ");
                            _ip("5. ");
                            _e();
                        }
                        _e();
                    }
                    _e();
                }
                _e();
            }
            _e();
        }

        _fb(sc, "학습이론", "학습이란 어떻게 일어나는 것인가?");
        {
            _s();
            _ip("행동주의 학습이론", true);
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
