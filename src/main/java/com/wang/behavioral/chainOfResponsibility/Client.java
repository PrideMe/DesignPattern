package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new ConcreteHandler();
        handler1.setSuccessor(handler2);
        handler1.handlerRequest();
    }
}
