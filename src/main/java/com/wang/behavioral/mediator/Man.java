package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:男人类
 */
public class Man extends Person {
    public Man(String name, int age, int requestAge, MarriageAgency marriageAgency) {
        super(name, age, Sex.MALE, requestAge, marriageAgency);
    }
}
