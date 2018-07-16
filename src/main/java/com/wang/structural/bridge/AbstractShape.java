package com.wang.structural.bridge;

/**
 * @author wang.
 * @date 2018/7/16.
 * Description:
 */
public abstract class AbstractShape {
    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
