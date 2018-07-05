package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class IntelCPU implements CPU {
    @Override
    public void calculate() {
        System.out.println("来了一个intel CPU");
    }
}
