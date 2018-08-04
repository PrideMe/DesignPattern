package com.wang.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:备忘录模式-具体备份
 */
@Getter
@Setter
public class Backup {
    private String contentToBack;
    private int version;

    public Backup(String contentToBack) {
        this.contentToBack = contentToBack;
    }
}
