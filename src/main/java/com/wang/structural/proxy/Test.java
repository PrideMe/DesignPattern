package com.wang.structural.proxy;

/**
 * @author wang.
 * @date 2018/7/7.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        RealSubject realSubject = new RealSubject();
//        Subject subject = new ProxySubject(realSubject);
//        subject.request();
        IGamePlayer gamePlayer = new GamePlayer("李逍遥");
        IGamePlayer proxy = new GamePlayerProxy(gamePlayer);
        proxy.killBoss();
        proxy.upGrade();
    }
}
