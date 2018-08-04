package com.wang.behavioral.visitor;

import java.util.Random;
import java.util.Vector;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:结构对象角色
 */
public class ObjectStructure {
    private Vector<Element> elements = new Vector<>();

    public void action(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void createElements() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            if (random.nextInt(100) > 50) {
                elements.add(new ConcreteElement1());
            } else {
                elements.add(new ConcreteElement2());
            }
        }
    }
}
