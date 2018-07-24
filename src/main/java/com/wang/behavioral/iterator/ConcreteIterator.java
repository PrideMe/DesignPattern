package com.wang.behavioral.iterator;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;

    private int index;

    private int size;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.index = 0;
        this.size = aggregate.size();
    }

    @Override
    public Object next() {
        if (index < size) {
            return aggregate.getElement(index++);
        } else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }
}
