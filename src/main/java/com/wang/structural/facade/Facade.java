package com.wang.structural.facade;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:外观模式-门面模式
 */
public class Facade {
    //被委托的对象
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void methodA() {
        classA.methodA();
    }

    public void methodB() {
        classB.methodB();
    }

    public void methodC() {
        classC.methodC();
    }
}
