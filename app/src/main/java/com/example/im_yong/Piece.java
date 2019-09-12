package com.example.im_yong;

import java.util.ArrayList;

public class Piece {
    String title;
    ArrayList<Piece> sub_pieces = new ArrayList<Piece>();
    String memo;
    int children_count;

    Piece(String title, String memo) {
        this.title = title;
        this.memo = memo;
        this.children_count = 0;
    }

    Piece(String title) {
        this(title, null);
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
