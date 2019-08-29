package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.CUR;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._s;
import static com.example.im_yong.SubjectInfo.insp;
import static com.example.im_yong.SubjectInfo.p1;
import static com.example.im_yong.SubjectInfo.p2;
import static com.example.im_yong.SubjectInfo.p3;
import static com.example.im_yong.SubjectInfo.p4;
import static com.example.im_yong.SubjectInfo.p5;

import static com.example.im_yong.SubjectInfo.pi;
import static com.example.im_yong.SubjectInfo.pp;
import static com.example.im_yong.SubjectInfo.ps;

public class Cont_00_Curriculum {
    static void put_curriculum() {

        ps.add(new Piece("교육과정"));


        ps.get(CUR).put(pp[pi] = new Piece("교육과정의 이해"));
        {
            _s();
            insp(new Piece("교육과정의 정의"));
            {
                _s();
                insp(new Piece("교육목표 실현을 위한 체계적인 교육계획"));
                _e();
            }

            insp(new Piece("층위에 따른 교육과정 유형"));
            {
                _s();
                insp(new Piece("공식적 교육과정"));
                insp(new Piece("잠재적 교육과정"));
                insp(new Piece("영 교육과정"));
                _e();

            }

            insp(new Piece("중심내용에 따른 교육과정 유형"));
            {
                _s();
                insp(new Piece("교과중심 교육과정"));
                insp(new Piece("경험중심 교육과정"));
                insp(new Piece("학문중심 교육과정"));
                insp(new Piece("인간중심 교육과정"));
                _e();
            }

            insp(new Piece("교육과정 이론의 여러 유형"));
            {
                _s();
                insp(new Piece("전통주의"));
                insp(new Piece("개념-경험주의"));
                insp(new Piece("재개념주의"));
                _e();
            }
            _e();
        }

        ps.get(CUR).put(p1 = new Piece("교육과정 개발"));
        {
            p1.put(p2 = new Piece("교육과정 개발 모형"));
            {
                p2.put(p3 = new Piece("타일러]_ 합리적 교육과정 개발모형"));
                {
                    p3.put(p4 = new Piece("교육목표 설정", "학습자-사회-교과전문가\n교육철학-교육심리학\n행동목표 진술"));
                    p3.put(p4 = new Piece("학습경험 선정", "기회\n만족\n가능성\n다경험\n다성과\n협동"));
                    p3.put(p4 = new Piece("학습경험 조직", "계속성\n계열성\n통합성"));
                    p3.put(p4 = new Piece("학습경험 평가"));
                }
                p2.put(p3 = new Piece("워커]_ 실제적 교육과정 개발모형"));
                {
                    p3.put(p4 = new Piece("강령", "공감대 형성을 위한 준비"));
                    p3.put(p4 = new Piece("숙의", "교육과정 개발의 목적과 달성방법 확인\n합의 도출"));
                    p3.put(p4 = new Piece("설계", "교육 프로그램의 상세 계획 수립\n합의 없어도 진행됨"));
                }
                p2.put(p3 = new Piece("타바]_ 귀납적 모형"));
                {
                    p3.put(p4 = new Piece("시험적 교수학습 단원생산"));
                    {
                        p4.put(p5 = new Piece("1.요구 진단"));
                        p4.put(p5 = new Piece("2.목표 설정"));
                        p4.put(p5 = new Piece("3.내용 선정"));
                        p4.put(p5 = new Piece("4.내용 조직"));
                        p4.put(p5 = new Piece(CC.divide_line));
                        p4.put(p5 = new Piece("5.학습경험 선정"));
                        p4.put(p5 = new Piece("6.학습경험 조직"));
                        p4.put(p5 = new Piece("7.평가 내용·방법·수단 결정"));
                        p4.put(p5 = new Piece("8.균형과 계열성 검증"));
                    }
                    p3.put(p4 = new Piece("시험단원 검증"));
                    p3.put(p4 = new Piece("개정 & 통합"));
                    p3.put(p4 = new Piece("구조 개발"));
                    p3.put(p4 = new Piece("새단원 정착 & 확산"));
                }
                p2.put(p3 = new Piece("위긴스&맥타이]_ 백워드 교육과정 설계모형"));
                {
                    p3.put(p4 = new Piece("단원 목적과 질문 개발"));
                    p3.put(p4 = new Piece("평가 계획"));
                    p3.put(p4 = new Piece("학습경험과 수업전개 내용 계획"));
                }
                p2.put(p3 = new Piece("스킬벡]_ 학교중심 교육과정 개발모형", "상황분석\n비선형적 구성\n학교 특성 최적화"));
                {
                    p3.put(p4 = new Piece("상황분석"));
                    p3.put(p4 = new Piece("목표설정"));
                    p3.put(p4 = new Piece("프로그램 구성"));
                    p3.put(p4 = new Piece("판단과 실행"));
                    p3.put(p4 = new Piece("조정-피드백-평가-재구성"));
                }
            }

            p1.put(p2 = new Piece("(★) 교육과정 재개념주의 모형"));
            {
                p2.put(p3 = new Piece("파이너]_ 꾸레레 교육과정"));
                {
                    p3.put(p4 = new Piece("꾸레레 방법론"));
                    {
                        p4.put(p5 = new Piece("소급"));
                        p4.put(p5 = new Piece("전진"));
                        p4.put(p5 = new Piece("분석"));
                        p4.put(p5 = new Piece("종합"));

                    }
                    p3.put(p4 = new Piece("자서전적 방법"));
                    {
                        p4.put(p5 = new Piece("자신의 교육경험 그대로 쓰기"));
                        p4.put(p5 = new Piece("'행동이나 사고 결정에 작용한 가정이나 논리'를 비판적 검토하기"));
                        p4.put(p5 = new Piece("타인들의 경험을 자서전적으로 분석하기"));

                    }
                }
                p2.put(p3 = new Piece("아이즈너]_ 예술적 교육과정 개발모형", "문제해결 목표\n표출목표"));
                {
                    p3.put(p4 = new Piece("영교육과정"));
                }
            }
        }

        ps.get(CUR).put(p1 = new Piece("우리나라의 교육과정"));
        {
            p1.put(p2 = new Piece("교육과정의 편성 및 운영"));
            p1.put(p2 = new Piece("2015 개정 교육과정"));
            {
                p2.put(p3 = new Piece("핵심역량"));
                {
                    p3.put(p4 = new Piece("자기관리 역량"));
                    p3.put(p4 = new Piece("지식·정보처리 역량"));
                    p3.put(p4 = new Piece("창의적사고 역량"));
                    p3.put(p4 = new Piece("의사소통 역량"));
                    p3.put(p4 = new Piece("심미적감성 역량"));
                    p3.put(p4 = new Piece("공동체 역량"));
                }
            }
            p1.put(p2 = new Piece("자유학기제"));
        }
    }
}
