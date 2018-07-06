package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class ComputerDirector {
    private ComputerBuilder builder;

    public T410 builderT410() {
        builder = new T410Builder();
        builder.builderCPU();
        builder.builderRAM();
        builder.builderHardDisk();
        builder.builderGraphicCard();
        builder.builderMonitor();
        builder.builderOS();
        return (T410) builder.getComputer();
    }

    public X201 builderX201() {
        builder = new X201Builder();
        builder.builderCPU();
        builder.builderRAM();
        builder.builderHardDisk();
        builder.builderGraphicCard();
        builder.builderMonitor();
        builder.builderOS();
        return (X201) builder.getComputer();
    }
}
