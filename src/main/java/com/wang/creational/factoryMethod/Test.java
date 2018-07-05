package com.wang.creational.factoryMethod;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        Creator creator = new ConcreteCreator();
//        ConcreteProduct product = creator.factory(ConcreteProduct.class);
//        product.method1();
//
//        FruitGardener fruitGardener = new AppleGardener();
//        Fruit fruit = fruitGardener.factory();
//        fruit.plant();
//        fruit.grow();
//        fruit.harvest();
//
//        fruitGardener = new GrapeGardener();
//        fruit = fruitGardener.factory();
//        fruit.plant();
//        fruit.grow();
//        fruit.harvest();

//        Car car = null;
//        try {
//            car = Driver.getCar("BMW");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        car.driver();
        Car car = Driver.getBenz();
        car.driver();
    }
}
