package com.wang.structural.bridge;

/**
 * @author wang.
 * @date 2018/7/16.
 * Description:
 */
public class Circle extends AbstractShape {
    private Color color;

    public Circle(Color color) {
        super(color);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("使用"+color.getColor()+"画圆形");
    }
}
