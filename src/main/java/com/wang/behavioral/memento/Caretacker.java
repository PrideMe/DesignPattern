package com.wang.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:备忘录模式-负责人角色
 */
@Getter
@Setter
public class Caretacker {
    private Memento memento;
}
