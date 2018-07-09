package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/9.
 * Description:
 */
public abstract class CarDecorator implements Car {
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void show() {
        this.car.show();
    }
}
