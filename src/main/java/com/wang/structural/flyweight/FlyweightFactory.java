package com.wang.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class FlyweightFactory {
    private static Map<String, Flyweight> pool = new HashMap<>();

    private FlyweightFactory() {
    }

    public static Flyweight getFlyweight(String intrinsicState) {
        Flyweight flyweight = pool.get(intrinsicState);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return flyweight;
    }
}
