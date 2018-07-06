package com.wang.creational.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
@Getter
@Setter
public class T410 extends Computer {
    private String graphicCard;

    public T410() {
        this.setType("ThinkPad T410");
    }

    @Override
    public String toString() {
        return "T410{" +
                "graphicCard='" + graphicCard + '\'' +
                "} " + super.toString();
    }
}
