package com.wang.structural.composite;

/**
 * @author wang.
 * @date 2018/7/15.
 * Description:
 */
public class Employee implements Company {
    private String name;
    private String position;
    private int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "";
        info += "姓名：" + this.name;
        info += "\t职位：" + this.position;
        info += "\t薪水：" + this.salary;
        return info;
    }
}
