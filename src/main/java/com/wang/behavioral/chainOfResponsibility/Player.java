package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public abstract class Player {
    private Player successor;

    public abstract void handler(int i);

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }

    public void next(int index) {
        if (successor != null) {
            successor.handler(index);
        } else {
            System.out.println("游戏结束");
        }
    }
}
