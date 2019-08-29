package com.example.im_yong;

public class Initializer {
    static public void initialize(Piece root_piece){
        SubjectInfo.init_informations();
        for(Piece piece : SubjectInfo.ps){
            root_piece.put(piece);
        }
    }
}
