package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class CPU extends Hardware {

    public CPU(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为"+getType()+"的CPU正在运转");
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitCPU(this);
    }
}
