package com.wang.behavioral.observer;

/**
 * @author wang.
 * @date 2018/8/1.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        Subject subject = new ConcreteSubject();
//        Observer observer = new ConcreteObserver();
//        subject.attach(observer);
//        subject.notifyObserver();
        Button button = new Button();
        button.setColor("白色");
        button.setX(0);
        button.setY(0);
        System.out.println(button);

        button.addClickableObserver(new ChangeColorObsever());
        button.addClickableObserver(new ChangeCoordinateObserver());
        button.addClickableObserver(new OtherObserver());

        button.click();
        System.out.println(button);
    }
}
