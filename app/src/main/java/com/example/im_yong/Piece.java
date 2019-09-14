package com.example.im_yong;

import java.util.ArrayList;

public class Piece {
    static int ID_next = 0;
    int ID;
    String title;
    ArrayList<Piece> sub_pieces = new ArrayList<Piece>();
    String memo;
    int children_count;
    Integer itn; //importance. 중요한 정도 0,,,,,,10 or null
    Boolean al; //alone. 단일 용어로 쓰이는지 1(O) or null

    Piece(String title, Boolean al, Integer itn, String memo) {
        this.ID = this.ID_next++;
        this.title = title;
        this.memo = memo;
        this.children_count = 0;
        if (al == null)
            this.al = false;
        else
            this.al = al;
        this.itn = itn;
    }

    Piece(String title) {
        this(title, null, null, null);
    }

    Piece(String title, String memo) {
        this(title, null, null, memo);
    }

    Piece(String title, Boolean al) {
        this(title, al, null, null);
    }

    Piece(String title, Boolean al, Integer itn) {
        this(title, al, itn, null);
    }

    Piece(String title, Boolean al, String memo) {
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
