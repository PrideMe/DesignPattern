package com.wang.behavioral.memento;

/**
 * @author wang.
 * @date 2018/8/4.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        //定义发起人
//        Originator originator = new Originator();
//        //定义负责人
//        Caretacker caretacker = new Caretacker();
//        //创建一个备忘录
//        caretacker.setMemento(originator.createMemento());
//        //恢复一个备忘录
//        originator.restoreMemento(caretacker.getMemento());
        VersionControlSystem versionControlSystem = new VersionControlSystem();
        Document document = new Document();
        document.setContentToBack("contentSave1");
        document.setContentNoBack("contentNoSave1");
        System.out.println(document);
        versionControlSystem.addBackup(document.save());
        document.setContentToBack("contentSave2");
        document.setContentNoBack("contentNoSave2");
        System.out.println(document);
        versionControlSystem.addBackup(document.save());
        document.setContentToBack("contentSave3");
        document.setContentNoBack("contentNoSave3");
        System.out.println(document);
        document.resume(versionControlSystem.getBackup(1));
        System.out.println(document);
        document.resume(versionControlSystem.getLastVersion());
        System.out.println(document);
    }
}
