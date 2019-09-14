package com.example.im_yong;

import java.util.ArrayList;

public class Initializer {
    static void init_static_members() {
        SubjectInfo.pi = 0;
        SubjectInfo.mainActivity = null;
        SubjectInfo.ps = new ArrayList<>();
        SubjectInfo.pp = new Piece[20];
        Piece.ID_next = 0;
    }

    static public void contents_initialize(Piece root_piece) {
        SubjectInfo.init_informations();
        for (Piece piece : SubjectInfo.ps) {
            root_piece.put(piece);
        }
    }
}
