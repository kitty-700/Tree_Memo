package com.example.im_yong;

import java.util.ArrayList;

public class Piece {
    String title;
    ArrayList<Piece> sub_pieces = new ArrayList<Piece>();
    String memo;
    int children_count;
    int importance; //중요한 정도 0,,,,,,10 or -1
    int alone; //단일 용어로 쓰이는지 0(X), 1(O) or -1

    Piece(String title, int alone, int importance, String memo) {
        this.title = title;
        this.memo = memo;
        this.children_count = 0;
        this.alone = alone;
        this.importance = importance;
    }

    Piece(String title) {
        this(title, -1, -1, null);
    }

    Piece(String title, int alone) {
        this(title, alone, -1, null);
    }
    Piece(String title, int alone, int importance) {
        this(title, alone, importance, null);
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
