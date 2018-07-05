package com.wang.creational.factory;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:工厂模式之工厂方法，抽象工厂
 */
public interface Creator {
    /**
     * 抽象工厂生产方法
     * @param clazz 自定义参数类型
     * @param <T> 泛型参数
     * @return Product子类
     */
    <T extends Product> T factory(Class<T> clazz);
}
