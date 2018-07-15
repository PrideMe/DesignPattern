package com.wang.structural.composite;

/**
 * @author wang.
 * @date 2018/7/11.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.operation();
        //创建树枝节点
        Composite branch = new Composite();
        //创建叶子节点
        Leaf leaf = new Leaf();
        branch.add(leaf);
        root.add(branch);
        display(root);
    }

    public static void display(Composite root) {
        for (Component component : root.getChild()) {
            if (component instanceof Leaf) {
                component.operation();
            } else {
                component.operation();
                display((Composite) component);
            }
        }
    }

}
