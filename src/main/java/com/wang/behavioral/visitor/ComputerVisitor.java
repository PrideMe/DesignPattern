package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public interface ComputerVisitor {
    void visitCPU(CPU cpu);

    void visitHarddisk(Harddisk harddisk);
}
