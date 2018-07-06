package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class T410Builder implements ComputerBuilder {
    private T410 computer = new T410();

    @Override
    public void builderCPU() {
        computer.setCpu("Intel Core i7 6700");
    }

    @Override
    public void builderRAM() {
        computer.setRam("4GB 2133MHz");
    }

    @Override
    public void builderHardDisk() {
        computer.setHardDisk("500GB 7200转");
    }

    @Override
    public void builderGraphicCard() {
        computer.setGraphicCard("Nvidia GTX960");
    }

    @Override
    public void builderMonitor() {
        computer.setMonitor("三星17英寸");
    }

    @Override
    public void builderOS() {
        computer.setOs("Win10");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
