package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/7/31.
 * Description:抽象同事类
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void action();

    public void change() {
        this.mediator.colleagueChanged(this);
    }
}
