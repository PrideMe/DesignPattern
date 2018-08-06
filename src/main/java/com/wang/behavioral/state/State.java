package com.wang.behavioral.state;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:状态模式-抽象状态
 */
@Getter
@Setter
public abstract class State {
    protected Context context;

    public abstract void handle();
}
