package com.wang.structural.flyweight;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class ConcreteFlyweight implements Flyweight {
    //内部状态
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态："+intrinsicState+"外部状态："+extrinsicState);
    }
}
