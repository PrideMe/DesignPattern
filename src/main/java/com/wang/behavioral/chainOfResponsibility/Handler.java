package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:责任链模式-抽象处理者
 */
public abstract class Handler {
    private Handler successor;

    public abstract void handlerRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
