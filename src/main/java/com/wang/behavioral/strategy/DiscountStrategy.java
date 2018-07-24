package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:打折策略-抽象策略
 */
public abstract class DiscountStrategy {

    private double price;

    private int num;

    public DiscountStrategy(double price, int num) {
        this.price = price;
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public int getNum() {
        return num;
    }

    public abstract double calculateDiscount();
}
