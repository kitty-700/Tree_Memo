package com.example.im_yong;

import java.util.ArrayList;

public class Piece {
    String title;
    ArrayList<Piece> sub_pieces = new ArrayList<Piece>();
    String memo;

    Piece(String title, String memo) {
        this.title = title;
        this.memo = memo;
    }

    Piece(String title) {
        this.title = title;
        this.memo = null;
    }

    void put(Piece piece) {
        this.sub_pieces.add(piece);
    }

    int children_count() {
        int count = 0;
        for (Piece piece : sub_pieces) {
            count += piece.children_count();
        }
        return count += sub_pieces.size();
    }
}
