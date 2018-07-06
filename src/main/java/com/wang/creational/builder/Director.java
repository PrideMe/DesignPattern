package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product builder() {
        builder.setPart1();
        builder.setPart2();
        builder.setPart3();
        return builder.builerProduct();
    }
}
