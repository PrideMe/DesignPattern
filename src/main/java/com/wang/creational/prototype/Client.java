package com.wang.creational.prototype;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class Client {
    public Prototype operation(Prototype prototype) {
        return prototype.clone();
    }
}
