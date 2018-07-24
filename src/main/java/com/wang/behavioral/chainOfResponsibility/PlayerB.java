package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class PlayerB extends Player {
    public PlayerB(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handler(int i) {
        if (2 == i) {
            System.out.println("playerB 喝酒");
        } else {
            System.out.println("playerB传下去");
            next(i);
        }
    }
}
