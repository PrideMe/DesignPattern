package com.wang.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang.
 * @date 2018/7/11.
 * Description:
 */
public class Composite implements Component {
    private ArrayList<Component> components = new ArrayList<>(10);

    @Override
    public void operation() {
        System.out.println("树枝");
    }

    public void add(Component component) {
        this.components.add(component);
    }

    public void remove(Component component) {
        this.components.remove(component);
    }

    public ArrayList<Component> getChild() {
        return this.components;
    }
}
