package com.wang.behavioral.iterator;

import java.util.Vector;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class ConcreteAggregate implements Aggregate {
    private Vector vector = new Vector();
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index) {
        if (index < this.vector.size()) {
            return this.vector.get(index);
        } else {
            return null;
        }
    }

    public int size() {
        return this.vector.size();
    }
}
