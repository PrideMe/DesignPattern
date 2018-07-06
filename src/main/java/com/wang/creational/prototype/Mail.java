package com.wang.creational.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
@Getter
@Setter
public class Mail implements Cloneable {
    private String username;
    private String content;

    public Mail(String content) {
        this.content = content;
    }

    @Override
    public Mail clone() {
        Mail mail;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        return mail;
    }
}
