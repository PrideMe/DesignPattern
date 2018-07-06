package com.wang.creational.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
@Getter
@Setter
@ToString
public abstract class Computer {
    private String type;
    private String cpu;
    private String ram;
    private String hardDisk;
    private String monitor;
    private String os;
}
