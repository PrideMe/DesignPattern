package com.wang.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:访问者模式-抽象硬件
 */
@Getter
@Setter
public abstract class Hardware {
    private String type;

    public Hardware(String type) {
        this.type = type;
    }

    public abstract void run();

    public abstract void accept(ComputerVisitor visitor);
}
