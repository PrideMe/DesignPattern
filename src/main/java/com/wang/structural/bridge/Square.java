package com.wang.structural.bridge;

/**
 * @author wang.
 * @date 2018/7/16.
 * Description:
 */
public class Square extends AbstractShape {
    private Color color;
    public Square(Color color) {
        super(color);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("使用"+color.getColor()+"画正方形");
    }
}
