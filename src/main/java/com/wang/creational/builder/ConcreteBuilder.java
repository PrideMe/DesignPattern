package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class ConcreteBuilder implements Builder {
    Product product = new Product();
    @Override
    public void setPart1() {
        System.out.println("A部分");
    }

    @Override
    public void setPart2() {
        System.out.println("B部分");
    }

    @Override
    public void setPart3() {
        System.out.println("C部分");
    }

    @Override
    public Product builerProduct() {
        return product;
    }
}
