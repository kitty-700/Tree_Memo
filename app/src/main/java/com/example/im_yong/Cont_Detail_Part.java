package com.example.im_yong;

public class Cont_Detail_Part {
    /* TODO */
    static final String main_thema = "교육학";
    static final int CUR = 0;
    static final int TEC = 1;
    static final int EVA = 2;
    static final int GUI = 3;
    static final int ADM = 4;
    static final int PSY = 5;
    static final int SOC = 6;
    static final int PHI = 7;
    static final int subject_codes[] = {CUR, TEC, EVA, GUI, ADM, PSY, SOC, PHI};
    static int favorite_subjects[] = {CUR, TEC, EVA, ADM};// Optional.관심 과목 추가. 마땅히 없으면 subject_code[] 와 같은 값을 주면 됨.

    public static void init_informations() {
        Cont_Edu_00_Curriculum.content_installing(CUR);
        Cont_Edu_01_Technology.content_installing(TEC);
        Cont_Edu_02_Evaluation.content_installing(EVA);
        Cont_Edu_03_Guidance.content_installing(GUI);
        Cont_Edu_04_Administration.content_installing(ADM);
        Cont_Edu_05_Psychology.content_installing(PSY);
        Cont_Edu_06_Sociology.content_installing(SOC);
        Cont_Edu_07_Philosophy.content_installing(PHI);
    }
    /* TODO [END] */
}
