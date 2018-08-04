package com.wang.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:备忘录模式-备忘录角色
 */
@Getter
@Setter
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
