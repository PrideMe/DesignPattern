package com.wang.creational.factoryMethod;

/**
 * @author wang.
 * @date 2018/7/4.
 * Description:工厂模式之工厂方法，具体工厂
 */
public class ConcreteCreator implements Creator {
    @Override
    public <T extends Product> T factory(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
