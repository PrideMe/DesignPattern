package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/2.
 * Description: 单例模式之饿汉式，类加载时，就进行对象实例化
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    /**
     * 保证外界无法实例化
     */
    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
