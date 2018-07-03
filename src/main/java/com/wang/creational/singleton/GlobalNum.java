package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/2.
 * Description:
 */
public class GlobalNum {
    private static GlobalNum globalNum = new GlobalNum();
    private int num = 0;

    private GlobalNum() {}

    public static GlobalNum getGlobalNum() {
        return globalNum;
    }

    public synchronized int getNum() {
        return ++num;
    }
}
