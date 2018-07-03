package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/2.
 * Description: 单例模式之懒汉式，第一次引用类时，才进行对象实例化
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    synchronized public static LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
