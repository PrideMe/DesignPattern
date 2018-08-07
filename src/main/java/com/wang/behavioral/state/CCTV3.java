package com.wang.behavioral.state;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:具体频道-具体状态
 */
public class CCTV3 implements Channel {
    @Override
    public void display() {
        System.out.println("CCTV3 非常6+1");
    }
}
