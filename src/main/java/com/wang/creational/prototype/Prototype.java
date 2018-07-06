package com.wang.creational.prototype;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:原型模式
 */
public interface Prototype extends Cloneable {
    Prototype clone();
}
