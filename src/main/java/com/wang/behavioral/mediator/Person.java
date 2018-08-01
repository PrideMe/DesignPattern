package com.wang.behavioral.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:人的抽象类
 */
@Getter
@Setter
public abstract class Person {
    private String name;
    private int age;
    private Sex sex;
    private int requestAge;
    private MarriageAgency marriageAgency;

    public Person(String name, int age, Sex sex, int requestAge, MarriageAgency marriageAgency) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.requestAge = requestAge;
        this.marriageAgency = marriageAgency;
        marriageAgency.register(this);
    }

    public void findPartner() {
        this.marriageAgency.pair(this);
    }

}
