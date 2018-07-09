package com.wang.structural.adapter;

/**
 * @author wang.
 * @date 2018/7/9.
 * Description:
 */
public class FoodAdapter extends ShuiJiao implements HunTun {
    @Override
    public void makeHunTun() {
        super.makeShuiJiao();
        System.out.println("馄饨和睡觉一样是以面包馅的食物");
    }
}
