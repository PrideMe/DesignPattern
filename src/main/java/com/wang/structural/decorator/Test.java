package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/8.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        component = new ConcreateDecorator(component);
        component.operation();
    }
}
