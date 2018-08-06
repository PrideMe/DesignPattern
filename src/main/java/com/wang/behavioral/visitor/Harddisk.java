package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class Harddisk extends Hardware {

    public Harddisk(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为"+getType()+"的硬盘正在运转");
    }

    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visitHarddisk(this);
    }
}
