package com.wang.behavioral.state;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:具体频道-具体状态
 */
public class CCTV2 implements Channel {
    @Override
    public void display() {
        System.out.println("CCTV2 经济半小时");
    }
}
