package com.wang.structural.proxy;

/**
 * @author wang.
 * @date 2018/7/7.
 * Description:
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实对象的方法");
    }
}
