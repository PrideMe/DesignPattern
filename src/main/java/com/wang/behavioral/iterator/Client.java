package com.wang.behavioral.iterator;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");
        aggregate.add("D");
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
