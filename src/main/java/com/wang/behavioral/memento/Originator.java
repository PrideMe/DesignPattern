package com.wang.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:备忘录模式-发起人角色
 */
@Getter
@Setter
public class Originator {
    private String state;

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
