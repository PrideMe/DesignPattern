package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class PlayerA extends Player {

    public PlayerA(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handler(int i) {
        if (1 == i) {
            System.out.println("playerA 喝酒");
        } else {
            System.out.println("playerA传下去");
            next(i);
        }
    }
}
