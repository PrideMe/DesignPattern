package com.wang.structural.flyweight;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class Game {
    public static void main(String[] args) {
        Chesspiece p1 = ChesspieceFactory.getChesspiece("白");
        p1.put(3,2);
        Chesspiece p2 = ChesspieceFactory.getChesspiece("黑");
        p1.put(3,3);
        Chesspiece p3 = ChesspieceFactory.getChesspiece("白");
        p1.put(4,3);
    }
}
