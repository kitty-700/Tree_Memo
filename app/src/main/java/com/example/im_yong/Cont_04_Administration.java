package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.ADM;
import static com.example.im_yong.SubjectInfo.p1;
import static com.example.im_yong.SubjectInfo.p2;
import static com.example.im_yong.SubjectInfo.p3;
import static com.example.im_yong.SubjectInfo.p4;
import static com.example.im_yong.SubjectInfo.ps;

public class Cont_04_Administration {
    static void put_admin() {

        SubjectInfo.ps.add(new Piece("교육행정"));

        ps.get(ADM).put(p1 = new Piece("체제이론"));
        {
            p1.put(p2 = new Piece("개방체제이론"));
            p1.put(p2 = new Piece("게젤&구바]_ 역할과 인성의 상호작용 모형"));
            p1.put(p2 = new Piece("게젤&구바]_ 역할과 인성의 사회과정모형"));
            p1.put(p2 = new Piece("게젤&텔렌]_ 수정 모형"));
        }

        ps.get(ADM).put(p1 = new Piece("동기이론"));
        {

            p1.put(p2 = new Piece("인간관"));
            {
                p2.put(p3 = new Piece("맥거리거]_ X-Y 이론"));
                p2.put(p3 = new Piece("아지리스]_ 미성숙-성숙 이론"));
            }
            p1.put(p2 = new Piece("┌ 내용이론", "'무엇이' 동기를 유발시키는가?"));
            {
                p2.put(p3 = new Piece("매슬로우]_ 욕구계층이론"));
                p2.put(p3 = new Piece("허즈버그]_ 동기-위생이론"));
                p2.put(p3 = new Piece("동기 유발을 위한 직무 재설계"));
                p2.put(p3 = new Piece("알더퍼]_ 생존-관계-성장 이론 (ERG)"));
            }
            p1.put(p2 = new Piece("└ 과정이론", "'어떻게' 동기가 유발되는가?"));
            {
                p2.put(p3 = new Piece("브룸]_ 기대이론"));
                p2.put(p3 = new Piece("포터&롤러]_ 기대이론 (aka.성과-만족 이론)"));
                p2.put(p3 = new Piece("아담스]_ 공정성 이론"));
                p2.put(p3 = new Piece("로크]_ 목표설정 이론"));
            }
        }

        ps.get(ADM).put(p1 = new Piece("지도성론"));
        {
            p1.put(p2 = new Piece("지도자 특성론"));
            {
                p2.put(p3 = new Piece("스톡딜]_ 연구"));
            }
            p1.put(p2 = new Piece("지도성 행위론"));
            {
                p2.put(p3 = new Piece("할핀]_ 지도성 행위연구"));
                p2.put(p3 = new Piece("블레이크&모톤]_ 관리망"));
                p2.put(p3 = new Piece("미시간 대학 연구 : 직무 중심과 종업원 중심"));
                p2.put(p3 = new Piece("타넨바움&슈미트]_ 지도성 유형 연속선"));
            }
            p1.put(p2 = new Piece("상황적 지도성론"));
            {
                p2.put(p3 = new Piece("피들러]_ 상황적 지도성 이론"));
                p2.put(p3 = new Piece("허쉬&블랜차드]_ 상황적 지도성론"));
            }
            p1.put(p2 = new Piece("새로운 지도성 이론"));
            {
                p2.put(p3 = new Piece("변혁적 지도성론"));
                p2.put(p3 = new Piece("분산적 지도성론"));
                p2.put(p3 = new Piece("슈퍼 리더십"));
            }
        }

        ps.get(ADM).put(p1 = new Piece("조직론"));
        {
            p1.put(p2 = new Piece("조직의 유형"));
            {
                p2.put(p3 = new Piece("파슨스]_ 사회적 기능 유형"));
                p2.put(p3 = new Piece("블라우&스콧]_ 조직 유형"));
                p2.put(p3 = new Piece("칼슨]_ 봉사조직 유형"));
                p2.put(p3 = new Piece("에찌오니]_ 순응조직"));
                p2.put(p3 = new Piece("카츠&칸]_ 사회적 기능에 따른 분류"));
            }

            p1.put(p2 = new Piece("학교조직의 특성"));
            {
                p2.put(p3 = new Piece("전문적 관료제"));
                p2.put(p3 = new Piece("조직화된 무질서 조직"));
                p2.put(p3 = new Piece("이완조직"));
                p2.put(p3 = new Piece("이중조직"));
                p2.put(p3 = new Piece("학습조직"));
            }

            p1.put(p2 = new Piece("조직풍토"));
            {

            }
        }


    }
}
