package com.wang.behavioral.iterator;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public interface Aggregate {
    void add(Object object);

    Iterator createIterator();
}
