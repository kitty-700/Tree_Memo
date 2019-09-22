package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.PHI;
import static com.example.im_yong.SubjectInfo.*;


public class Cont_Edu_07_Philosophy {
    static void content_installing(int sc) {//subject code

        SubjectInfo.insert_into_ps(sc,"교육철학","교육의 개념·목적·원리에 대한 학문");

        _fb(sc, "핵심");
        {
            _s();
            _ip("교육개념의 정의 방식");//1513p
            {
                _s();
                _ip("조작적 정의");
                _ip("규범적 정의");
                _ip("서술적 정의", "자연과학적 방법");
                _e();
            }
            _ip("피터스]_ 교육개념의 준거", true, 8, "규범·인지·과정");//1509p
            {
                _s();
                _ip("규범적 준거", "교육 목적에 관한 것\n내재적 가치 추구");
                _ip("인지적 준거", "교육 내용에 관한 것\n지적 안목");
                _ip("과정적 준거", "교육 방법에 관한 것\n도덕적으로 온당한 방법으로 전달되어야 내재적 가치 실형");

                _e();
            }
            _ip("주요 교육관");//1504p
            {
                _s();
                _ip("주형관", "교육은 사회가 제시하는 지식과 신념을 수용시키는 것");
                _ip("성장관");
                {
                    _s();
                    _ip("루소]_", "교육은 타고난 특성의 발현을 돕는 것");
                    _ip("듀이]_", "교육은 계속적 성장을 돕는 것");
                    _e();
                }
                _ip("형식도야이론", "교육은 정신능력을 단련시키는 것");
                _e();
            }
            _ip("철학의 영역");//1530p
            {
                _s();
                _ip("존재론", "절대 불변하는 실재가 무엇인가?");
                _ip("인식론", "지식은 어떻게 얻어지는가?");
                _ip("가치론", "무엇이 가치로운가?");
                _e();
            }
            _ip("교육철학에 대한 관점");//1529p
            {
                _s();
                _ip("교육관으로서");
                _ip("교육목적론으로서");
                _ip("철학적 지식의 응용으로서");
                _ip("학문적 의미로서");
                _e();
            }
            _ip("교육철학의 기능");//1530p
            {
                _s();
                _ip("분석적 기능", "개념의 의미와 논리적 관계 규명");
                _ip("평가적 기능", "판단의 기준 제시");
                _ip("사변적 기능", "가설이나 아이디어 창출");
                _ip("통합적 기능", "다양한 기준이나 관점의 종합");
                _e();
            }
            _ip("자유교육");
            {
                _s();
                _ip("고대 그리스");
                {
                    _s();
                    _ip("무지·편견·지식의 편협·판단의 오류로부터 인간을 자유롭게 하기 위해 합리적 이성을 발달시키는 것에 목표를 둠");
                    _e();
                }
                _ip("피터스&허스트]_ 자유교육론", true, 6, "feat.현대");//1525p
                {
                    _s();
                    _ip("(초기)\n'지식의 형식'→'합리적 마음'의 계발");
                    _ip("(후기)\n'사회적 실제'→'실천적 합리성'의 계발");
                    _e();
                }
                _e();
            }
            _ip("지식", "그냥 정보처리모형 참고하자...이건 사장된거");
            _e();
        }

        _fb(sc, "교육사조");
        {
            _s();
            _ip("실용주의 & 듀이]_ 교육론");//1536p
            {
                _s();
                _ip("실용주의", true, 6, "지식의 사회적 유용성이 있어야 가치로운 것");
                _ip("듀이]_ 교육론", true, 6, "지식의 사회적 유용성이 있어야 가치로운 것");
                {
                    _s();
                    _ip("반성적 사고");
                    _ip("성장의 조건");
                    {
                        _s();
                        _ip("미숙성", "발전 가능성을 내포");
                        _ip("가소성", "경험으로부터 배우는 힘");
                        _e();
                    }
                    _ip("흥미와 도야");
                    _e();
                }
                _e();
            }
            _ip("20세기 미국의 교육철학");//1541p
            {
                _s();
                _ip("진보주의", true, "feat.자연주의·실용주의\n아동의 성장을 통한 사회진보 추구");
                _ip("본질주의", true, "agnst.진보주의\n학문적 전통과 문화유산의 전달");
                _ip("항존주의", true, "진리·이성은 불변하므로, 고전을 통해 이성을 도야");
                _ip("재건주의", true, "교육을 통한 인류문화의 재건");
                _e();
            }
            _ip("현대의 교육철학");//1549p
            {
                _s();
                _ip("실증주의", true, "객관적 증거를 통한 입증\n자연과학적 방법론");
                _ip("분석적 교육철학", true, 6, "feat.실증주의\n교육 용어·개념을 분석하여 논리적 관계를 명료화");//1550p
                {
                    _s();
                    _ip("논리실증주의", "과학적 방법을 통해");
                    _ip("언어분석학파", "일상생활의 언어를 통해");
                    _e();
                }
                _ip("현상학", true, "현상이란 우리의 인식과 무관히 존재하는 오브젝트가 아니라 인간의 의식작용에 의해 구성되어 나타나게 된 것");
                {
                    _s();
                    _ip("하이데거]_ 현상학");
                    _e();
                }
                _ip("실존주의", true, "\"실존이 본질에 앞선다\"\n사전에 규정된 인간의 본질이란 없으며, 자유의지를 가진 인간이 스스로 선택하고 책임지며 자아실현");
                {
                    _s();
                    _ip("전인교육");
                    _ip("비연속적 성장");
                    _e();
                }
                _ip("비판이론", "feat.신마르크스주의\nagnst.자본주의 체제\nagnst.경제결정론\nagnst.실증주의\n모순된 체제로부터의 인간해방 추구");
                _ip("하버마스]_ 의사소통론", true, 8, "agnst.실증주의\n목적·합리적 행위 배격\n의사소통적 행위 추구");//1561p
                _ip("포스트 모더니즘", true, "agnst.모더니즘\n모더니즘의 보편적·합리적·절대적·객관적·총체적 지향 비판");
                {
                    _s();
                    _ip("푸코]_ 훈육론", "지식과 권력이 결탁하여 교육이 훈육이 되고 있음");
                    _e();
                }
                _e();
            }
            _ip("유교의 교육사상");
            _e();
        }
    }
}
