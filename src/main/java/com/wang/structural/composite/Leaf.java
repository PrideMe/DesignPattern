package com.wang.structural.composite;

/**
 * @author wang.
 * @date 2018/7/11.
 * Description:
 */
public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("叶子");
    }
}
