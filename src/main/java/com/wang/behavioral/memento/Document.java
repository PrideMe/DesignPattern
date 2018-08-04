package com.wang.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:备忘录模式-发起者
 */
@Getter
@Setter
public class Document {
    private String contentToBack;
    private String contentNoBack;

    public Backup save() {
        System.out.println("保存到备忘录");
        return new Backup(this.contentToBack);
    }

    public void resume(Backup backup) {
        System.out.println("从备忘录恢复");
        contentToBack = backup.getContentToBack();
    }

    @Override
    public String toString() {
        return "contentToBack=" + contentToBack + ", contentNoBack=" + contentNoBack;
    }
}
