package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class PlayerD extends Player {
    public PlayerD(Player successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void handler(int i) {
        if (4 == i) {
            System.out.println("PlayerD 喝酒");
        } else {
            System.out.println("PlayerD传下去");
            next(i);
        }
    }
}
