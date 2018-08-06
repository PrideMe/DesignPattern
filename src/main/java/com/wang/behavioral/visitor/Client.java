package com.wang.behavioral.visitor;

/**
 * @author wang.
 * @date 2018/8/6.
 * Description:
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        ComputerVisitor visitor1 = new TypeVisitor();
        ComputerVisitor visitor2 = new RunVisitor();

        computer.accept(visitor1);
        System.out.println("-----------");
        computer.accept(visitor2);
    }
}
