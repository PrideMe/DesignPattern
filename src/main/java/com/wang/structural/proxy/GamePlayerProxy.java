package com.wang.structural.proxy;

import java.util.Date;

/**
 * @author wang.
 * @date 2018/7/7.
 * Description:
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void killBoss() {
        this.log();
        gamePlayer.killBoss();
    }

    @Override
    public void upGrade() {
        gamePlayer.upGrade();
        this.count();
    }

    private void log() {
        System.out.println("打怪开始时间：" + new Date().toString());
    }

    private void count() {
        System.out.println("升级所用时间：20小时");
    }
}
