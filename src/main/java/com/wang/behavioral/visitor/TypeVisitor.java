package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class TypeVisitor implements ComputerVisitor {
    @Override
    public void visitCPU(CPU cpu) {
        System.out.println("CPU型号:"+cpu.getType());
    }

    @Override
    public void visitHarddisk(Harddisk harddisk) {
        System.out.println("硬盘型号:"+harddisk.getType());
    }
}
