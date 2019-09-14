package com.example.im_yong;

public class Cont_Detail_Part {
    static final String main_thema = "교육학";
    static final int CUR = 0;
    static final int TEC = 1;
    static final int EVA = 2;
    static final int GUI = 3;
    static final int ADM = 4;
    static final int PSY = 5;
    static final int SOC = 6;
    static final int PHI = 7;
    public static void insert_into_ps(String subject_title){
        SubjectInfo.ps.add(new Piece(subject_title));
    }
    public static void init_informations() {
        Cont_Edu_00_Curriculum.put_cur();
        Cont_Edu_01_Technology.put_tec();
        Cont_Edu_02_Evaluation.put_eva();
        Cont_Edu_03_Guidance.put_gui();
        Cont_Edu_04_Administration.put_adm();
        Cont_Edu_05_Psychology.put_psy();
        Cont_Edu_06_Sociology.put_soc();
        Cont_Edu_07_Philosophy.put_phi();
    }
}
