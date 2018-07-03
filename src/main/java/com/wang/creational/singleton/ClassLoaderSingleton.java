package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/3.
 * Description: 基于ClassLoader机制来避免多个线程同时实例化该变量
 */
public class ClassLoaderSingleton {
    private static class SingletonHolder {
        private static ClassLoaderSingleton singleton = new ClassLoaderSingleton();
    }

    public ClassLoaderSingleton getSingleton() {
        return SingletonHolder.singleton;
    }
}
