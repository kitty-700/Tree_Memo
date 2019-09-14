package com.example.im_yong;

import static com.example.im_yong.Cont_Detail_Part.SOC;
import static com.example.im_yong.SubjectInfo._e;
import static com.example.im_yong.SubjectInfo._fb;
import static com.example.im_yong.SubjectInfo._s;
import static com.example.im_yong.SubjectInfo._ip;

public class Cont_Edu_06_Sociology {
    static void put_soc() {
        int sc = SOC; //subject code

        Cont_Detail_Part.insert_into_ps("교육사회학");

        _fb(sc, "이론");
        {
            _s();
            _ip("기능론");
            _ip("갈등론");
            _ip("해석적 접근 & 상징적 상호작용");
            _ip("교육과정 사회학");
            _e();
        }
        _fb(sc, "사회변동과 교육");
        {
            _s();
            _ip("학교팽창과 학력상승의 원인");
            _ip("사회발전과 교육");
            _e();
        }
        _fb(sc, "교육평등");
        {
            _s();
            _ip("평등관");
            {
                _s();
                _ip("허용적 평등관");
                _ip("보장적 평등관");
                _ip("과정적 평등관", "aka.교육조건의 평등");
                _ip("결과적 평등관", "aka.보상적 평등관");
                _ip("사회개혁에 의한 교육 평등관", "갈등론");
                _e();
            }
            _ip("교육의 사회평등 기여론");
            _ip("교육의 사회불평등 재생산론 & 무효과론");
            _e();
        }
        _fb(sc, "시험");
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
        _fb(sc, "학업성취");
        {
            _s();
            _ip("학업성취 격차의 원인에 대한 견해");
            {
                _s();
                _ip("기능론");
                _ip("갈등론");
                _ip("교육과정 사회학");
                _ip("상징적 상호작용 이론");
                _ip("번스타인]_ 학교언어 연구", "학교는 중산층의 정련된 어법 사용");
                _e();
            }
            _ip("문화실조론","aka.문화박탈이론\n가정에서 배운 문화적 능력이 결핍 시 학업결손 초래");
            _ip("문화다원론","문화가 다양하므로, 익숙치 않은 문화가 학업격차의 원인");
            _ip("가정배경과의 관련");
            _ip("학교요인과의 관련");
            _e();
        }
        _fb(sc, "교육개혁");
        {
            _s();
            _ip("신자유주의에 근거한 학교개혁론");
            _ip("탈학교론","학교는 학습의 기능을 못하므로, 의무교육을 폐지하고 학습망을 통한 학습을 해야함");
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
