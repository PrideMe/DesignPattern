package com.wang.creational.prototype;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:具体的原型
 */
public class ConcretePrototype implements Prototype {
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
