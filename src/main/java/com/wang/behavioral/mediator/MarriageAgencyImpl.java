package com.wang.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:
 */
public class MarriageAgencyImpl implements MarriageAgency {
    List<Man> manList = new ArrayList<>();
    List<Woman> womanList = new ArrayList<>();

    @Override
    public void pair(Person person) {
        if (person.getSex() == Sex.MALE) {
            for (Woman woman : womanList) {
                if (woman.getAge() == person.getRequestAge()) {
                    System.out.println(person.getName() + "和" + woman.getName() + "配对成功！");
                    return;
                }
            }
        } else if (person.getSex() == Sex.FEMALE) {
            for (Man man : manList) {
                if (man.getAge() == person.getRequestAge()) {
                    System.out.println(person.getName() + "和" + man.getName() + "配对成功！");
                    return;
                }
            }
        }
        System.out.println("没有为" + person.getName() + "找到合适的对象");
    }

    @Override
    public void register(Person person) {
        if (person.getSex() == Sex.MALE) {
            manList.add((Man) person);
        } else if (person.getSex() == Sex.FEMALE) {
            womanList.add((Woman) person);
        }
    }
}
