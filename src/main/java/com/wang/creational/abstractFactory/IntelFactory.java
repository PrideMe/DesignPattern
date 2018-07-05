package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class IntelFactory implements AbstractComputerFactory {
    @Override
    public CPU createrCPU() {
        return new IntelCPU();
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard();
    }
}
