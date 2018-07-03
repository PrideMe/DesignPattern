package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/3.
 * Description: 基于DCL双重校验
 */
public class DCLSingleton {
    private volatile static DCLSingleton dclSingleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getDclSingleton() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}
