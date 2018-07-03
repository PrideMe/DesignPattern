package com.wang.creational.singleton;

import java.io.IOException;

/**
 * @author wang.
 * @date 2018/7/2.
 * Description:
 */
public class Test {
    public static void main(String[] args) throws IOException {
//        HungrySingleton hungrySingleton1 = HungrySingleton.getHungrySingleton();
//        HungrySingleton hungrySingleton2 = HungrySingleton.getHungrySingleton();
//        HungrySingleton hungrySingleton3 = HungrySingleton.getHungrySingleton();
//        HungrySingleton hungrySingleton4 = HungrySingleton.getHungrySingleton();
//
//        LazySingleton lazySingleton1 = LazySingleton.getLazySingleton();
//        LazySingleton lazySingleton2 = LazySingleton.getLazySingleton();
//        LazySingleton lazySingleton3 = LazySingleton.getLazySingleton();
//        LazySingleton lazySingleton4 = LazySingleton.getLazySingleton();
//
//        Runtime runtime = Runtime.getRuntime();
//        runtime.exec("calc");
//
//        GlobalNum globalNum1 = GlobalNum.getGlobalNum();
//        GlobalNum globalNum2 = GlobalNum.getGlobalNum();
//        System.out.println(globalNum1);
//        System.out.println(globalNum2);

//        NumberThread thread1 = new NumberThread("线程A");
//        NumberThread thread2 = new NumberThread("线程B");
//
//        thread1.start();
//        thread2.start();
        DBConnection connection1 = EnumSingleton.INSTANCE.getInstance();
        DBConnection connection2 = EnumSingleton.INSTANCE.getInstance();
        System.out.println(connection1 == connection2);
    }
}
