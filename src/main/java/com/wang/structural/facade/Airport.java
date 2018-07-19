package com.wang.structural.facade;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:外观模式-子系统1
 */
public class Airport {
    public void bookTicket(String from, String to) {
        System.out.println("订购了从" + from + "到" + to + "的机票");
    }
}
