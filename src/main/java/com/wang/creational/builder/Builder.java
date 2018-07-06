package com.wang.creational.builder;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public interface Builder {
    //设置产品的不同部分
    void setPart1();

    void setPart2();

    void setPart3();

    Product builerProduct();
}
