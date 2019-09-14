package com.example.im_yong;

import java.util.ArrayList;

public class Piece {
    String title;
    ArrayList<Piece> sub_pieces = new ArrayList<Piece>();
    String memo;
    int children_count;
    Integer itn; //importance. 중요한 정도 0,,,,,,10 or null
    Integer al; //alone. 단일 용어로 쓰이는지 1(O) or null

    Piece(String title, Integer al, Integer itn, String memo) {
        this.title = title;
        this.memo = memo;
        this.children_count = 0;
        this.al = al;
        this.itn = itn;
    }

    Piece(String title) {
        this(title, null, null, null);
    }

    Piece(String title, String memo) {
        this(title, null, null, memo);
    }

    Piece(String title, Integer al) {
        this(title, al, null, null);
    }

    Piece(String title, Integer al, Integer itn) {
        this(title, al, itn, null);
    }

    Piece(String title, Integer al, String memo) {
        this(title, al, null, memo);
    }

    void put(Piece piece) {
        this.sub_pieces.add(piece);
        this.children_count++;
    }

    int children_counting() {
        int count = this.children_count;
        for (Piece piece : sub_pieces) {
            count += piece.children_counting();
        }
        return count;
    }
}
