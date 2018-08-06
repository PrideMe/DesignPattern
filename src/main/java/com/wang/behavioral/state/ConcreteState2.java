package com.wang.behavioral.state;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class ConcreteState2 extends State {
    @Override
    public void handle() {
        System.out.println("行为2的逻辑处理"+getContext());
    }
}
