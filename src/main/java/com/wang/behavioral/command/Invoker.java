package com.wang.behavioral.command;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:命令模式-调用者
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
