package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public interface ComputerBuilder {
    void builderCPU();

    void builderRAM();

    void builderHardDisk();

    void builderGraphicCard();

    void builderMonitor();

    void builderOS();

    Computer getComputer();
}
