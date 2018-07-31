package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/7/31.
 * Description:具体同事类1
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("this is colleague1 action");
    }
}
