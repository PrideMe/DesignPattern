package com.wang.creational.prototype;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Client client = new Client();
        Prototype prototype = new ConcretePrototype();
        System.out.println(prototype);
        prototype = client.operation(prototype);
        System.out.println(prototype);
    }
}
