package com.wang.structural.adapter;

/**
 * @author wang.
 * @date 2018/7/9.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
        HunTun hunTun = new FoodAdapter();
        hunTun.makeHunTun();
    }
}
