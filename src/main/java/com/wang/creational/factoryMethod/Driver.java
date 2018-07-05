package com.wang.creational.factoryMethod;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class Driver {
    public static Car getCar(String type) throws Exception {
        if ("Audi".equalsIgnoreCase(type)) {
            return new Audi();
        } else if ("Benz".equalsIgnoreCase(type)) {
            return new Benz();
        } else if ("Bmw".equalsIgnoreCase(type)) {
            return new Bmw();
        } else {
            throw new Exception();
        }
    }

    public static Car getAudi() {
        return new Audi();
    }

    public static Car getBenz() {
        return new Benz();
    }

}
