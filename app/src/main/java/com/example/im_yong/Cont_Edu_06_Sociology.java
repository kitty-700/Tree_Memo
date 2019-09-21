package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.SOC;
import static com.example.im_yong.SubjectInfo.*;

public class Cont_Edu_06_Sociology {
    static void content_installing(int sc) {//subject code

        SubjectInfo.insert_into_ps(sc, "교육사회학");

        _fb(sc, "핵심");
        {
            _s();
            _ip("기능론");//1382p
            {
                _s();
                _ip("선발");
                _ip("사회화");
                {
                    _s();
                    _ip("뒤르켐]_ 사회화론", true, 7);
                    _ip("드리븐]_ 사회화론", true, 8, "가정에서는 배우기 힘든, 산업사회에서 중요시되는 규범을 가르침");
                    {
                        _s();
                        _ip("독립성");
                        _ip("성취성");
                        _ip("보편성");
                        _ip("특정성");
                        _e();
                    }
                    _e();
                }
                _e();
            }
            _ip("갈등론");//1390p
            {
                _s();
                _ip("사회적 재생산이론", "학교가 기존 사회를 재생산");
                {
                    _s();
                    _ip("보울스&진티스]_ 경제적 재생산론", true, 7, "경제 결정론");
                    _ip("브로디외]_ 문화적 재생산이론", true, 9);
                    {
                        _s();
                        _ip("자본");
                        {
                            _s();
                            _ip("문화적 자본");
                            {
                                _s();
                                _ip("아비투스 문화자본", "개인에게 내면화된 문화능력");
                                _ip("객관화된 문화자본", "문화적 재화\n옛 고서, 그림, 골동품");
                                _ip("제도화된 문화자본", "교육제도를 통해 주어지는 학위 등");
                                _e();
                            }
                            _ip("경제적 자본", "물적 자본");
                            _ip("사회적 자본", "≒인맥 can be 경제자본\n사회적 연고나 관계로 인해 형성");
                            _ip("상징적 자본", "위 자본들을 정당화하는 이데올로기");
                            _e();
                        }
                        _e();
                    }
                    _ip("알뛰세]_ 자본주의 국가론", true, 6, "국가는 자본가 계급에 봉사함");
                    {
                        _s();
                        _ip("헤게모니", 7, "이데올로기를 주입하여 폭력에 의존하지 않고 피지배계급의 능동적 동의를 도출해내어 사회전체에 대한 지도력을 확보하는 지배방식");
                        _e();
                    }
                    _e();
                }
                _ip("탈재생산이론", true, 6, "불평등 구조 내 피지배계급의 능동성 강조");
                {
                    _s();
                    _ip("애플]_ 문화적 헤게모니", true, 6, "인간은 능동적인 존재");
                    _ip("윌리스]_ 저항이론", true, 7, "학생들의 반 학교문화");
                    _e();
                }
                _e();
            }
            _ip("해석적 접근");
            {
                _s();
                _ip("유형");
                {
                    _s();
                    _ip("상징적 상호작용이론", true, 6);
                    _ip("문화기술 연구", true, 7);
                    _ip("교환이론", true);
                    _e();
                }
                _ip("우즈]_ 교사의 생존전략");
                _ip("맥닐]_ 교사의 방어적 수업");
                _ip("낙인과 상호작용");
                {
                    _s();
                    _ip("자성예언효과", true, 7, "aka.피그말리온 효과\n교사의 차별적인 기대가 아동을 그에 맞게 변화시킴");
                    _e();
                }
                _e();
            }
            _ip("교육과정 사회학", 8, "교육과정은 사회현상이므로 보편·객관적이지 않음");
            {
                _s();
                _ip("번스타인]_ 교육과정 연구", true, 6, "사회 지배원리는 교육적 지식코드이며, 이것이 교육과정·교수방법·평가에 영향");
                {
                    _s();
                    _ip("분류", "교육과정을 구성하는 교육내용들 간 관계");
                    _ip("구조", "가르칠 내용과 가르치지 않을 내용의 구분");
                    _ip("집합형 (강한 분류·구조)", "학생의 선택권 X");
                    _ip("통합형 (약한 분류·구조)", "교사와 학생의 재량권 ↑\n교과 간 교류 ↑");
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "사회변동과 교육");
        {
            _s();
            _ip("학교팽창과 학력상승의 원인");
            {
                _s();
                _ip("학습욕구이론", true, 6, "인간이 학습욕구를 가지고있으므로");
                _ip("기술기능이론", true, 6, "학교는 산업사회의 핵심장치이며, 산업사회의 기술수준이 상승하므로");
                _ip("마르크스이론", true, 6);
                _ip("지위경쟁이론", true, 8, "학력이 사회적 지위 획득의 수단이므로");
                _ip("국민통합론", true, 6, "학교 팽창의 원인은 국민적 통합을 위해서임");
                _ip("계층 경쟁에 의한 학교팽창", true, 6, "≒지위 경쟁이론");
                _ip("학습욕구이론", true, 6);
                _e();
            }
            _ip("사회발전과 교육");
            {
                _s();
                _ip("발전교육론", true, 6, "feat.기능주의·행동주의");
                _ip("인적자원개발론 (HRD)", true, 6);
                _e();
            }
            _e();
        }
        _fb(sc, "교육평등");
        {
            _s();
            _ip("평등관");//1432p
            {
                _s();
                _ip("허용적 평등관", true, "신분·성·종교·인종 등으로 인한 교육기회 차별 제거");
                _ip("보장적 평등관", true, "취학을 가로막는 경제·지리·사회적 제반의 장애 제거");
                _ip("과정적 평등관", true, "aka.교육조건의 평등\n교육체제 내에서 제공되는 교사·교육목표·교육과정·교육시설 등에 있어 집단간 차별 제거");
                _ip("결과적 평등관", true, "aka.보상적 평등관\n교육적 혜택이 일정 수준에 도달해야함\n가정배경으로 인한 불이익을 사회가 보상");
                _ip("사회개혁에 의한 교육 평등관", "feat.갈등론\n혁명을 통해 사회구조를 평등하게 해야 교육평등");
                _e();
            }
            _ip("교육의 사회평등 기여론");
            {
                _s();
                _ip("해비거스트]_ 연구", true, 4);
                _ip("블로&던컨]_ 직업지위획득 모형", true, 6, "본인의 교육과 초기 경험이 직업적 성공에 큰 영향");
                _ip("인간자본론", true, 6, "교육은 생산성 향상을 위한 투자");
                _e();
            }
            _ip("교육의 사회불평등 재생산론 & 무효과론");//1447p
            {
                _s();
                _ip("보울스&진티스]_ 이론");
                _ip("카노이]_ 분석", "교육은 중상위 계층에만 봉사\n일제시대땐 초등교육만 받아도 이득");
                _ip("라이트&페론]_ 이론");
                _ip("무효과론");
                _e();
            }
            _e();
        }
        _fb(sc, "교육선발 (선발)");//1453p
        {
            _s();
            _ip("교육적 기능");
            _ip("사회적 기능");
            _ip("5지선다 평가가 학습자에게 미치는 영향");
            _ip("학자들의 견해");
            {
                _s();
                _ip("부르디외]_");
                _ip("푸코]_");
                _e();
            }
            _e();
        }
        _fb(sc, "학업성취", 8);//1461p
        {
            _s();
            _ip("학업성취 격차의 원인에 대한 견해");
            {
                _s();
                _ip("기능론");
                _ip("갈등론");
                _ip("교육과정 사회학");
                _ip("상징적 상호작용 이론");
                _ip("번스타인]_ 학교언어 연구", true, 8, "학교는 중산층의 정련된 어법 사용"); //
                _e();
            }
            _ip("문화실조론", true, "aka.문화박탈이론\n가정에서 배운 문화적 능력이 결핍 시 학업결손 초래");
            _ip("문화다원론", true, "문화가 다양하므로, 익숙치 않은 문화가 학업격차의 원인");
            _ip("가정배경과의 관련");
            {
                _s();
                _ip("콜맨]_", "학교차는 미미하고, 가정배경(사회자본)이 학업성취에 가장 큰 영향"); //1463p
                _ip("젠크스]_"); //
                _e();
            }
            _ip("학교요인과의 관련");
            {
                _s();
                _ip("학교요인");
                _ip("교사의 기대효과");//1466p
                {
                    _s();
                    _ip("로젠탈&제이콥슨]_", "저학년, 하류계층, 성적이 중간일수록 영향 높음"); //
                    _ip("브로피&굿]_"); //
                    _ip("리스트]_"); //
                    _e();
                }
                _ip("학교문화");
                {
                    _s();
                    _ip("콜맨]_");
                    _ip("브루코버]_");
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "교육개혁");
        {
            _s();
            _ip("신자유주의에 근거한 학교개혁론");
            _ip("탈학교론", true, 7, "학교는 학습의 기능을 못하므로, 의무교육을 폐지하고 학습망을 통한 학습을 해야함");//1475p
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
