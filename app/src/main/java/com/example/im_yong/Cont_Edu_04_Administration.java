package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.ADM;
import static com.example.im_yong.SubjectInfo.*;


public class Cont_Edu_04_Administration {
    static void put_adm() {
        int sc = ADM; //subject code

        Cont_Detail_Part.insert_into_ps("교육행정", "어떻게 하면 교육조직 목표를 효율적 달성할 수 있을까?");

        _fb(sc, "핵심");
        {
            _s();
            _ip("교육행정에 대한 세 가지 관점", "\"교육행정이란 이런 것이다.\"");
            {
                _s();
                _ip("국가공권설", "aka.법규행정·통제행정\n교육행정은 국가의 통치권이 작용하는 것");
                _ip("기능설", "aka.지원행정·조장행정\n교육행정은 교육이 지닌 독자성과 특수성을 인정하여, 학교 교육목표 달성을 지원하고 봉사하는 것");
                {
                    _s();
                    _ip("교육의 특수성", true, 7, "교육의 효과는 장기간이므로 투입-산출 분석이 어렵고, 따라서 평가·통제가 어려우므로 자율성 인정");
                    _e();
                }
                _ip("경영설", "aka.조정행정\n교육행정은 산업사회의 경영학적 지식과 체제접근이론을 적용하여 합리적인 교육활동을 성취하는 것");
                _e();
            }
            _ip("교육행정의 원리");
            {
                _s();
                _ip("합법성의 원리");
                _ip("기회균등의 원리");
                _ip("자주성 존중의 원리");
                _ip("지방분권의 원리");
                _ip("민주성의 원리");
                _ip("공공성의 원리");
                _ip("효율성의 원리");
                _ip("안정성 유지의 원리");
                _ip("전문성 보장의 원리");
                _e();
            }
            _ip("교육행정 이론");
            {
                _s();
                _ip("고전적 관리론");
                {
                    _s();
                    _ip("과학적 관리론", "인간의 행동·직무를 분석하여 과업을 제시하고, 달성 시 보상");
                    {
                        _s();
                        _ip("교육에서는..", "교육행정에 과학적 관리를 도입해 교육에서의 낭비를 제거해야함");
                        _e();
                    }
                    _ip("행정관리론");
                    _e();
                }

                _ip("인간관계론", true, 7, "인간관계로 대표되는 비공식 조직이 조직목표 달성에 영향을 미침");
                {
                    _s();
                    _ip("메이요&뢰슬리스버거]_ 호손실험", true, 6, "사회적·심리적 조건, 그리고 비공식 조직이 생산성에 중요한 영향");
                    _ip("교육에서는..", "민주적 교육행정이 필요하고, 참여적·협동적인 장학을 해야함");
                    _e();
                }
                _ip("체제이론", true, 8, "조직이 처한 환경과의 상호작용 강조");
                {
                    _s();
                    _ip("핵심");
                    {
                        _s();
                        _ip("체제", "공동의 목표 달성을 위해 상호작용하는 여러 부분들 간 통합체");
                        _ip("환경", "체제와 상호작용하는 다른 체제들의 집합");
                        _e();
                    }
                    _ip("개방체제이론", true, 6, "학교는 개방체제이다.\n정치·경제·사회·문화 등의 다른 체제와 긴밀하게 상호작용하므로");
                    {
                        _s();
                        _ip("개방체제 특징");
                        {
                            _s();
                            _ip("모든 체제는 목표지향적 행동을 함");
                            _ip("체제는 하위체제 간의 기능적 상호작용을 통해 전체성을 유지");
                            _ip("체제는 체제 외부의 환경과 상호작용함");
                            _ip("체제는 환경과의 상호작용인 투입-산출과정을 통해 변화됨");
                            _e();
                        }
                        _e();
                    }
                    _ip("게젤&구바]_ 역할과 인성의 상호작용 모형");
                    _ip("게젤&구바]_ 사회과정모형", 6, "");
                    _ip("게젤&텔렌]_ 수정 모형");
                    _e();
                }
                _e();
            }
            _e();
        }

        _fb(sc, "체제이론");


        _fb(sc, "동기이론");
        {
            _s();
            _ip("인간관");
            {
                _s();
                _ip("맥거리거]_ X-Y 이론", true);
                _ip("아지리스]_ 미성숙-성숙 이론", true);
                _e();
            }
            _ip("┌ 내용이론", "'무엇이' 동기를 유발시키는가?");
            {
                _s();
                _ip("매슬로우]_ 욕구계층이론", true, "인간의 욕구가 중요도에 따라 일련의 위계를 형성함");
                _ip("허즈버그]_ 동기-위생이론", true, "feat.욕구계층이론\n동기 = 만족요인\\n위생 = 불만족요인\n개인 내부의 욕구 에너지에 관심을 두기보단...사람에게 일에 대한 긍정적·부정적 태도를 유발시키는 요인을 탐색하기 위한 작업환경에 초점");
                _ip("동기 유발을 위한 직무 재설계", true, "feat.동기-위생이론\n동기-위생이론의 '동기'를 유발하기 위한 방안");
                _ip("알더퍼]_ 생존-관계-성장 이론 (ERG)", true, "feat.욕구계층이론\n욕구를 생존욕구·관계욕구·성장욕구로 구분\n");
                _e();
            }
            _ip("└ 과정이론", "'어떻게' 동기가 유발되는가?");
            {
                _s();
                _ip("브룸]_ 기대이론", true, "보상의 가치가 바람직한가가 동기요인");
                _ip("포터&롤러]_ 기대이론", true, "feat.브룸]_ 기대이론\naka.성과-만족 이론\n성과가 직무만족에 영향을 미치는 동기요인");
                _ip("아담스]_ 공정성 이론", true, "타인과 비교하여 공정한지의 여부가 동기요인");
                _ip("로크]_ 목표설정 이론", true, "effto.MBO\n목표와 목표성취의 의도가 동기요인");
                _e();
            }
            _e();
        }

        _fb(sc, "지도성론");
        {
            _s();
            _ip("지도자 특성론", "지도성은 천부적인 개인 특성임\n↓\n지도자가 공통적으로 가진 특성과 자질 규명");
            {
                _s();
                _ip("스톡딜]_ 연구");
                _e();
            }
            _ip("지도성 행위론", "　효과적인 지도 행위와\n비효과적인 지도 행위를 비교\n↓\n성공적인 지도 행위 규명");
            {
                _s();
                _ip("핵심", "과업중심<->관계중심");
                _ip("할핀]_ 지도성 행위연구");
                _ip("블레이크&모톤]_ 관리망");
                _ip("미시간 대학 연구 : 직무 중심과 종업원 중심");
                _ip("타넨바움&슈미트]_ 지도성 유형 연속선");
                _e();
            }
            _ip("상황적 지도성론", "지도성의 효과는 상황에 따라 케바케\n↓\n상황에 따른 지도성 유형 규명");
            {
                _s();
                _ip("피들러]_ 상황적 지도성 이론", true, "상황?\n지도자-구성원 관계\n과업 구조화 : 비구조화\n지도자의 지위 & 권력");
                _ip("허쉬&블랜차드]_ 상황적 지도성론", true, "구성원의 직무성숙도\n┌ 전문성\n└ 동기수준");
                _e();
            }
            _ip("새로운 지도성 이론");
            {
                _s();
                _ip("핵심", "급변하는 사회 & 복잡한 문제");
                _ip("변혁적 지도성론", true, "변화를 촉진시킴");
                {
                    _s();
                    _ip("메커니즘", "지도자 : L\n구성원 : M");
                    {
                        _s();
                        _ip("1. 도덕성·솔선수범 (L→ M)");
                        _ip("2. 신뢰 (L ←M)");
                        _ip("3. 비전 제시 (L→ M)");
                        _ip("4. 헌신 (L ←M)");
                        _e();
                    }
                    _ip("핵심요소");
                    {
                        _s();
                        _ip("높은 기준의 윤리적·도덕적 행위");
                        _ip("기대와 도전감");
                        _ip("성장하려는 개개인의 욕구, 책임");
                        _e();
                    }
                    _e();
                }
                _ip("분산적 지도성론", true, "학교조직의 규모와 복잡성 증대\n교장이 힘들어용");
                {
                    _s();
                    _ip("1. 권한과 책임 분담");
                    _ip("2. 팀 구성 & 학습 & 과제", "교직원의 전문성 기반");
                    _ip("3. 팀 연결 & 과제 공유 -> 문제해결", "팀 네트워크");
                    _e();
                }
                _ip("슈퍼 리더십", true, "지도자에 대한 지도자\n팀원을 리더로 만들면 가능");
                _ip("켈&지미어]_ 리더십 대용 상황모형", true);
                {
                    _s();
                    _ip("대용 상황");
                    _ip("억제 상황");
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "조직론");
        {
            _s();
            _ip("핵심");
            {
                _s();
                _ip("공식 조직 & 비공식 조직");
                {
                    _s();
                    _ip("비공식 조직의 순기능과 역기능");
                    _e();
                }
                _ip("관료제", true, "대규모 조직의 효율적 운영방식");
                {
                    _s();
                    _ip("분업과 전문화");
                    {
                        _s();
                        _ip("+ : 전문성 향상");
                        _ip("- : 권태감");
                        _e();
                    }
                    _ip("권위의 위계");
                    {
                        _s();
                        _ip("+ : 업무의 원활한 조정");
                        _ip("- : 의사소통 장애");
                        _e();
                    }
                    _ip("규정과 규칙");
                    {
                        _s();
                        _ip("+ : 업무의 통일성과 안정성");
                        _ip("- : 목표전도 현상");
                        _e();
                    }
                    _ip("몰인정성");
                    {
                        _s();
                        _ip("+ : 합리적·긍정적 의사결정");
                        _ip("- : 사기저하");
                        _e();
                    }
                    _ip("경력 지향");
                    {
                        _s();
                        _ip("+ : 조직원의 충성심 확보");
                        _ip("- : 실적과 경력의 갈등 (무사안일주의)");
                        _e();
                    }
                    _e();
                }
                _e();
            }
            _ip("조직 유형");
            {
                _s();
                _ip("파슨스]_ 사회적 기능 유형", true, "조직이 수행하는 사회적 기능에 따라");
                {
                    _s();
                    _ip("생산조직");
                    _ip("정치적 목표지향조직");
                    _ip("통합조직");
                    _ip("유형 유지조직", "V");
                    _e();
                }
                _ip("블라우&스콧]_ 조직 유형", true, "조직의 주요 수혜자가 누구냐에 따라");
                {
                    _s();
                    _ip("호혜조직");
                    _ip("사업조직");
                    _ip("공공조직");
                    _ip("봉사조직", "V");
                    _e();
                }
                _ip("칼슨]_ 봉사조직 유형", true, "조직과 고객이 서로를 선택할 수 있는지에 따라");
                {
                    _s();
                    _ip("유형 I - 야생조직");
                    _ip("유형 II");
                    _ip("유형 III");
                    _ip("유형 IV - 사육조직", "aka 온상조직");
                    _e();
                }
                _ip("에찌오니]_ 순응조직", true, "순응이란?\n지도자 행사권력과\n구성원 참여수준\n둘 사이의 관계");
                {
                    _s();
                    _ip("강제조직");
                    _ip("공리조직");
                    _ip("규범조직");
                    _e();
                }
                _ip("카츠&칸]_ 사회적 기능에 따른 분류", true);
                _e();
            }
            _ip("학교조직의 특성", true);
            {
                _s();
                _ip("전문적 관료제");
                _ip("이중조직");
                _ip("조직화된 무질서 조직");
                _ip("이완조직");
                _ip("학습조직", "교사들의 자발적 참여");
                _e();
            }
            _ip("조직 풍토", "구성원의 행위에 영향을 미치는 일련의 내적 특성");
            {
                _s();
                _ip("할핀&크로프트]_ 학교조직 풍토", true, "1.교사와 교장\n2.교사 상호간\n 이 두 가지 작용에 대한 교장과 교사들의 지각으로 조직풍토를 측정하고자 함");
                {
                    _s();
                    _ip("교사와 교장의 행동특성");
                    {
                        _s();
                        _ip("교사");
                        _ip("교장");
                        _e();
                    }
                    _ip("조직풍토 유형");
                    {
                        _s();
                        _ip("개방적 풍토");
                        _ip("자율적 풍토");
                        _ip("친교적 풍토");
                        _ip("친권적 풍토");
                        _ip("폐쇄적 풍토");
                        _e();
                    }
                    _e();
                }
                _ip("호이&클로버]_ 개정된 학교 조직 풍토 척도 (OCDQ)", true);
                {
                    _s();
                    _ip("교사와 교장의 행동특성");
                    {
                        _s();
                        _ip("교사");
                        _ip("교장");
                        _e();
                    }
                    _ip("조직풍토 유형");
                    {
                        _s();
                        _ip("개방풍토");
                        _ip("몰입풍토");
                        _ip("일탈풍토");
                        _ip("폐쇄풍토");
                        _e();
                    }
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "┌ 교육기획");
        {
            _s();
            _ip("개념");
            _ip("특성");
            _ip("원리");
            _ip("과정");
            _ip("효용성");
            _ip("한계");
            _ip("접근 방법");
            {
                _s();
                _ip("사회 수요에 의한");
                _ip("인력 수요에 의한");
                _ip("수익률에 의한");
                _ip("국제 비교에 의한");
                _e();
            }
            _e();
        }
        _fb(sc, "└ 교육정책");
        {
            _s();
            _ip("개념");
            _ip("특성");
            _ip("형성 과정");
            _ip("형성 제약 요인");
            _e();
        }
        _fb(sc, "┌ 의사결정");
        {
            _s();
            _ip("의사결정에 대한 관점");
            {
                _s();
                _ip("합리적 관점", "모든 정보수집·검토·대안·비교분석");
                _ip("참여적 관점", "당사자들 간 논의 & 합의");
                _ip("정치적 관점", "타협");
                _ip("우연적 관점", "조직화된 무질서 조직에서");
                _e();
            }
            _ip("의사결정 모형");
            {
                _s();
                _ip("정책형성의 기본 모형", "어떻게 의사결정하는게 좋을까?");
                {
                    _s();
                    _ip("합리성 모형", true, "모든 데이터로 최적의 대안 선택\n비현실적");
                    _ip("사이몬&마치]_ 만족모형", true, "제한된 합리성 (휴리스틱)");
                    _ip("린드블롬]_ 점증모형", true, "보수적");
                    _ip("에찌오니]_ 혼합모형", true, "합리성 모형 + 점증모형");
                    _ip("코헨&마치]_ 쓰레기통 모형", true, "조직화된 무질서 조직의 의사결정 모형");
                    _ip("드로]_ 최적모형", true, "직관적 판단");
                    _e();
                }
                _ip("호이&타터]_ 의사결정 모형", true, "누굴 의사결정에 참여시킬 것인가?");
                {
                    _s();
                    _ip("");
                    _e();
                }
                _e();
            }
            _e();
        }
        _fb(sc, "└ 의사소통");
        {
            _s();
            _ip("의의");
            _ip("의사소통 기법 : 조하리의 창");
            _ip("조직의 갈등 관리 : 갈등 처리 방식");
            _e();
        }
        _fb(sc, "장학", "교사의 수업기술 향상을 통해 학생 학습을 촉진하려는 교육활동");
        {
            _s();
            _ip("장학 개념의 변천");
            {
                _s();
                _ip("권리장학 시대", "지시·통제·감독");
                _ip("협동장학 시대", "교육지원");
                _ip("수업장학 시대");
                _ip("발달장학 시대", "교사의 능동적 참여");
                _e();
            }
            _ip("장학의 모델");
            {
                _s();
                _ip("교내 자율장학", "학교 내외의 장학담당자가 교사의 수업 능력을 향상시켜줌");
                {
                    _s();
                    _ip("임상장학", true);
                    _ip("마이크로 티칭", true);
                    _ip("동료장학", true);
                    _ip("약식장학", true);
                    _ip("자기장학", true);
                    _ip("멘토링 장학", true);
                    _e();
                }
                _ip("선택적 장학");
                _ip("컨설팅 장학", true, "교사가 자발적으로 도움 요청");
                _e();
            }
            _e();
        }
        _fb(sc, "┌ 학교경영");
        {
            _s();
            _ip("학교경영 기초");
            _ip("학교경영 기법");
            {
                _s();
                _ip("목표관리기법 (MBO)", true, "조직의 구성원들이 공동으로 참여하여 목표수립·역할분담·성과평가·보상함");
                _ip("과업평가 계획기법", true);
                _ip("총체적 질 경영", true);
                _ip("조직개발 기법");
                _ip("정보관리체제 (MIS)");
                _ip("품목별 예산제도", true, "지출대상을 품목별로 세분화");
                _ip("성과주의 예산제도 (PBS)", true);
                _ip("기획 예산제도 (PPBS)", true);
                _ip("영 기준 예산제도 (ZBBS)", true);
                _e();
            }
            _e();
        }
        _fb(sc, "└ 학급경영");
        {
            _s();
            _e();
        }
    }
}
