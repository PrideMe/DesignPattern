package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/7/31.
 * Description:
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;

    @Override
    public void colleagueChanged(Colleague colleague) {
        concreteColleague1.action();
        concreteColleague2.action();
    }

    public void createConcreteMediator() {
        concreteColleague1 = new ConcreteColleague1(this);
        concreteColleague2 = new ConcreteColleague2(this);
    }

    public ConcreteColleague1 getConcreteColleague1() {
        return concreteColleague1;
    }

    public ConcreteColleague2 getConcreteColleague2() {
        return concreteColleague2;
    }
}
