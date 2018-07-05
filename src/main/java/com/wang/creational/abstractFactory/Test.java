package com.wang.creational.abstractFactory;

/**
 * @author wang.
 * @date 2018/7/5.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        AbstractFactory factory1 = new ConcreteFactory1();
//        AbstractFactory factory2 = new ConcreteFactory2();
//        ProductA productA1 = factory1.factoryA();
//        ProductA productA2 = factory2.factoryA();
//        productA1.method1();
//        productA2.method1();
//
//        ProductB productB1 = factory1.factoryB();
//        ProductB productB2 = factory2.factoryB();
//        productB1.method1();
//        productB2.method1();
        AbstractComputerFactory intelFactory = new IntelFactory();
        AbstractComputerFactory amdFactory = new AmdFactory();
        intelFactory.createrCPU().calculate();
        intelFactory.createMainBoard().installCPU();

        amdFactory.createrCPU().calculate();
        amdFactory.createMainBoard().installCPU();

    }
}
