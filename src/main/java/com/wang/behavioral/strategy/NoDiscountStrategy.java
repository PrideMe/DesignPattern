package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class NoDiscountStrategy extends DiscountStrategy {
    public NoDiscountStrategy(double price, int num) {
        super(price, num);
    }

    /**
     * 0 折扣
     */
    @Override
    public double calculateDiscount() {
        return 0;
    }
}
