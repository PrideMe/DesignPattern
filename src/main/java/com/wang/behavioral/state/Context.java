package com.wang.behavioral.state;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:状态模式-环境角色
 */
public class Context {
    public static State State1 = new ConcreteState1();
    public static State State2 = new ConcreteState2();

    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
        this.currentState.setContext(this);
    }

    public void handle1() {
        this.setCurrentState(State1);
        this.currentState.handle();
    }

    public void handle2() {
        this.setCurrentState(State2);
        this.currentState.handle();
    }
}
