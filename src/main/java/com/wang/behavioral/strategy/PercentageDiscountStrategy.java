package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class PercentageDiscountStrategy extends DiscountStrategy {
    public PercentageDiscountStrategy(double price, int num) {
        super(price, num);
    }

    /**
     * 享受15%的折扣
     */
    @Override
    public double calculateDiscount() {
        return getNum() * getPrice() * 0.15;
    }
}
