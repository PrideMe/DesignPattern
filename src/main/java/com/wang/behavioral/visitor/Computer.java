package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class Computer {
    private CPU cpu = new CPU("Intel Core i7-6700HQ");
    private Harddisk harddisk = new Harddisk("Seagate 500G");

    public void accept(ComputerVisitor visitor) {
        this.cpu.accept(visitor);
        this.harddisk.accept(visitor);
    }
}
