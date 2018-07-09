package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/9.
 * Description:
 */
public class ConcreteCarDecorator extends CarDecorator {
    public ConcreteCarDecorator(Car car) {
        super(car);
    }

    public void println(){
        System.out.println("给奔驰车喷涂彩绘");
    }

    public void setGPS(){
        System.out.println("给奔驰车安装GPS");
    }

    @Override
    public void show() {
        super.show();
        this.println();
        this.setGPS();
    }
}
