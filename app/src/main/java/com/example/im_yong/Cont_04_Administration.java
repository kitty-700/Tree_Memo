package com.example.im_yong;

import static com.example.im_yong.SubjectInfo.ADM;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._ip;
import static com.example.im_yong.SubjectInfo._s;

public class Cont_04_Administration {
    static void put_adm() {
        int sc = ADM; //subject code

        SubjectInfo.ps.add(new Piece("교육행정"));

        _fb(sc, "체제이론");
        {
            _s();
            _ip("개방체제이론");
            _ip("게젤&구바]_ 역할과 인성의 상호작용 모형");
            _ip("게젤&구바]_ 역할과 인성의 사회과정모형");
            _ip("게젤&텔렌]_ 수정 모형");
            _e();
        }

        _fb(sc, "동기이론");
        {
            _s();
            _ip("인간관");
            {
                _s();
                _ip("맥거리거]_ X-Y 이론");
                _ip("아지리스]_ 미성숙-성숙 이론");
                _e();
            }
            _ip("┌ 내용이론", "'무엇이' 동기를 유발시키는가?");
            {
                _s();
                _ip("매슬로우]_ 욕구계층이론");
                _ip("허즈버그]_ 동기-위생이론");
                _ip("동기 유발을 위한 직무 재설계");
                _ip("알더퍼]_ 생존-관계-성장 이론 (ERG)");
                _e();
            }
            _ip("└ 과정이론", "'어떻게' 동기가 유발되는가?");
            {
                _s();
                _ip("브룸]_ 기대이론");
                _ip("포터&롤러]_ 기대이론 (aka.성과-만족 이론)");
                _ip("아담스]_ 공정성 이론");
                _ip("로크]_ 목표설정 이론");
                _e();
            }
            _e();
        }

        _fb(sc, "지도성론");
        {
            _s();
            _ip("지도자 특성론");
            {
                _s();
                _ip("스톡딜]_ 연구");
                _e();
            }
            _ip("지도성 행위론");
            {
                _s();
                _ip("할핀]_ 지도성 행위연구");
                _ip("블레이크&모톤]_ 관리망");
                _ip("미시간 대학 연구 : 직무 중심과 종업원 중심");
                _ip("타넨바움&슈미트]_ 지도성 유형 연속선");
                _e();
            }
            _ip("상황적 지도성론");
            {
                _s();
                _ip("피들러]_ 상황적 지도성 이론");
                _ip("허쉬&블랜차드]_ 상황적 지도성론");
                _e();
            }
            _ip("새로운 지도성 이론");
            {
                _s();
                _ip("변혁적 지도성론");
                _ip("분산적 지도성론");
                _ip("슈퍼 리더십");
                _e();
            }
        }
        _fb(sc, "조직론");
        {
            _s();
            _ip("조직의 유형");
            {
                _s();
                _ip("파슨스]_ 사회적 기능 유형");
                _ip("블라우&스콧]_ 조직 유형");
                _ip("칼슨]_ 봉사조직 유형");
                _ip("에찌오니]_ 순응조직");
                _ip("카츠&칸]_ 사회적 기능에 따른 분류");
                _e();
            }
            _ip("학교조직의 특성");
            {
                _s();
                _ip("전문적 관료제");
                _ip("조직화된 무질서 조직");
                _ip("이완조직");
                _ip("이중조직");
                _ip("학습조직");
                _e();
            }
            _ip("조직풍토");
            {
                _s();
                _e();
            }
            _e();
        }
    }
}
