package com.wang.behavioral.iterator;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 * @author wang.
 * @date 2018/7/26.
 * Description:
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("向量1");
        vector.add("向量2");
        vector.add("向量3");
        vector.add("向量4");
        ArrayList list = new ArrayList();
        list.add("序列1");
        list.add("序列2");
        list.add("序列3");
        Stack stack = new Stack();
        stack.add("A");
        stack.add("B");
        stack.add("C");
        stack.add("D");
        stack.add("E");
        System.out.println("向量");
        show(vector.iterator());
        System.out.println("\n\n序列");
        show(list.iterator());
        System.out.println("\n\n堆栈");
        show(stack.iterator());
    }
    public static void show(java.util.Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
