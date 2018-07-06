package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class X201Builder implements ComputerBuilder {
    private X201 computer = new X201();

    @Override
    public void builderCPU() {
        computer.setCpu("Intel Core i7 8700K");
    }

    @Override
    public void builderRAM() {
        computer.setRam("16GB 2133MHz");
    }

    @Override
    public void builderHardDisk() {
        computer.setHardDisk("1TB SSD");
    }

    @Override
    public void builderGraphicCard() {
        //无显卡
    }

    @Override
    public void builderMonitor() {
        computer.setMonitor("京东方21英寸");
    }

    @Override
    public void builderOS() {
        computer.setOs("Win8");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
