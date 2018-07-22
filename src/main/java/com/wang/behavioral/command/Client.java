package com.wang.behavioral.command;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:测试
 */
public class Client {
    public static void main(String[] args) {
        //调用者
        Invoker invoker = new Invoker();
        //接收者
        Receiver receiver = new Receiver();
        //定义一个命令
        Command command = new ConcreteCommand(receiver);
        //执行
        invoker.setCommand(command);
        invoker.action();
    }
}
