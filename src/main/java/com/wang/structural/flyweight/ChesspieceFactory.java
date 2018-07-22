package com.wang.structural.flyweight;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class ChesspieceFactory {
    static final Chesspiece Black = new ChesspieceFlyweight("黑");
    static final Chesspiece WHITE = new ChesspieceFlyweight("白");

    public static Chesspiece getChesspiece(String color) {
        if (color.equals("白")) {
            return WHITE;
        } else if (color.equals("黑")) {
            return Black;
        }
        return null;
    }
}
