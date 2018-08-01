package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:
 */
public class Woman extends Person {
    public Woman(String name, int age,int requestAge, MarriageAgency marriageAgency) {
        super(name, age, Sex.FEMALE, requestAge, marriageAgency);
    }
}
