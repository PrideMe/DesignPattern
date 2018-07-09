package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/8.
 * Description:
 */
public class ConcreateDecorator extends Decorator {
    public ConcreateDecorator(Component component) {
        super(component);
    }

    public void method(){
        System.out.println("装饰");
    }

    @Override
    public void operation() {
        method();
        super.operation();
    }
}
