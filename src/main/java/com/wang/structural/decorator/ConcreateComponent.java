package com.wang.structural.decorator;

/**
 * @author wang.
 * @date 2018/7/8.
 * Description:
 */
public class ConcreateComponent implements Component {
    @Override
    public void operation() {
        System.out.println("业务");
    }
}
