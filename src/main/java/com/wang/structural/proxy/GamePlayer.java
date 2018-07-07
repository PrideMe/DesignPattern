package com.wang.structural.proxy;

/**
 * @author wang.
 * @date 2018/7/7.
 * Description:
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "升级");
    }
}
