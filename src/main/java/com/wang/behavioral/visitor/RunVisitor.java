package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class RunVisitor implements ComputerVisitor {
    @Override
    public void visitCPU(CPU cpu) {
        cpu.run();
    }

    @Override
    public void visitHarddisk(Harddisk harddisk) {
        harddisk.run();
    }
}
