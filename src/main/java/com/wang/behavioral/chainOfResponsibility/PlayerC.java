package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class PlayerC extends Player {
    public PlayerC(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handler(int i) {
        if (3 == i) {
            System.out.println("playerC 喝酒");
        } else {
            System.out.println("playerC传下去");
            next(i);
        }
    }
}
