package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class FixDiscountStrategy extends DiscountStrategy {
    public FixDiscountStrategy(double price, int num) {
        super(price, num);
    }

    /**
     * 固定折扣
     */
    @Override
    public double calculateDiscount() {
        return getNum() * 1;
    }
}
