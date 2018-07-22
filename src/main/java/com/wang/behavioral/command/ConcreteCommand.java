package com.wang.behavioral.command;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
