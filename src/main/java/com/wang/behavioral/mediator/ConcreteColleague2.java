package com.wang.behavioral.mediator;

/**
 * @author wang.
 * @date 2018/7/31.
 * Description:具体同事类2
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("this is colleague2 action");
    }
}
