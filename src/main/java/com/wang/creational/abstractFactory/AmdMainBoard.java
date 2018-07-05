package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class AmdMainBoard implements MainBoard {
    @Override
    public void installCPU() {
        System.out.println("我是AMD主板，需要插入Amd CPU");
    }
}
