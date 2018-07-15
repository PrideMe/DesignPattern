package com.wang.structural.composite;

import java.util.ArrayList;

/**
 * @author wang.
 * @date 2018/7/15.
 * Description:
 */
public class ConcreteCompany implements Company {
    private ArrayList<Company> companies = new ArrayList<>(4);
    private String name;
    private String position;
    private int salary;

    public ConcreteCompany(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void add(Company company) {
       this.companies.add(company);
    }

    public void remove(Company company) {
        this.companies.remove(company);
    }

    public ArrayList<Company> getChild() {
        return this.companies;
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
