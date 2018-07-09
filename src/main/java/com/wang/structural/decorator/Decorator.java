package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/8.
 * Description:
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
