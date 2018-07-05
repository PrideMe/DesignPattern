package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class AmdFactory implements AbstractComputerFactory {
    @Override
    public CPU createrCPU() {
        return new AmdCPU();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard();
    }
}
