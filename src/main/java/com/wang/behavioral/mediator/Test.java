package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        MarriageAgency marriageAgency = new MarriageAgencyImpl();

        Person person1 = new Man("张三", 22, 22, marriageAgency);
        Person person2 = new Man("李四", 22, 23, marriageAgency);
        Person person3 = new Woman("王五", 22, 22, marriageAgency);
        Person person4 = new Woman("赵六", 22, 22, marriageAgency);

        person1.findPartner();
        person2.findPartner();

    }
}
