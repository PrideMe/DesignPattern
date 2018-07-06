package com.wang.creational.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        Director director = new Director();
//        director.builder();
        ComputerDirector director = new ComputerDirector();
        T410 t410 = director.builderT410();
        System.out.println(t410);
        X201 x201 = director.builderX201();
        System.out.println(x201);
    }
}
