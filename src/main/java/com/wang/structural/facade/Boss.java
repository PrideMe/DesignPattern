package com.wang.structural.facade;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:
 */
public class Boss {
    public static void main(String[] args) {
        Secretary secretary = new Secretary();
        System.out.println("老板告诉秘书要到上海出差3天");
        secretary.trip("上海",3);
        System.out.println("-------------------------");
        System.out.println("老板告诉秘书要请5个人吃饭");
        secretary.repast(5);
    }
}
