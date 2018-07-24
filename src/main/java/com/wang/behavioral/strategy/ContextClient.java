package com.wang.behavioral.strategy;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class ContextClient {
    private DiscountStrategy discountStrategy;

    public ContextClient(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double contextCalDisc() {
        return this.discountStrategy.calculateDiscount();
    }

    public static void main(String[] args) {
        ContextClient contextClient1 = new ContextClient(new NoDiscountStrategy(48.5, 20));
        System.out.println("0折扣" + contextClient1.contextCalDisc());
        ContextClient contextClient2 = new ContextClient(new FixDiscountStrategy(46, 60));
        System.out.println("1折扣" + contextClient2.contextCalDisc());
        ContextClient contextClient3 = new ContextClient(new PercentageDiscountStrategy(38, 40));
        System.out.println("15%折扣" + contextClient3.contextCalDisc());
    }
}
