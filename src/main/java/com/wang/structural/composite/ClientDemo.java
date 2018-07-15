package com.wang.structural.composite;

/**
 * @author wang.
 * @date 2018/7/15.
 * Description:
 */
public class ClientDemo {
    public static void main(String[] args) {
        //CEO
        ConcreteCompany ceo = new ConcreteCompany("张三", "CEO", 100000);
        //经理
        ConcreteCompany dev = new ConcreteCompany("李四", "开发部经理", 12000);
        ConcreteCompany sale = new ConcreteCompany("王五", "销售部经理", 13000);
        ConcreteCompany finance = new ConcreteCompany("赵六", "财务部经理", 10000);
        //员工
        Company c1 = new Employee("A", "研发部", 4000);
        Company c2 = new Employee("B", "研发部", 5000);
        Company c3 = new Employee("C", "研发部", 6000);
        Company c4 = new Employee("D", "销售部", 4000);
        Company c5 = new Employee("E", "销售部", 2000);
        Company c6 = new Employee("F", "财务部", 3000);
        //生成树
        ceo.add(dev);
        ceo.add(sale);
        ceo.add(finance);

        dev.add(c1);
        dev.add(c2);
        dev.add(c3);

        sale.add(c4);
        sale.add(c5);

        finance.add(c6);

        System.out.println(ceo.getInfo());
        display(ceo);
    }

    public static void display(ConcreteCompany concreteCompany) {
        for (Company company : concreteCompany.getChild()) {
            if (company instanceof Employee) {
                System.out.println(company.getInfo());
            } else {
                System.out.println("---------------------------------");
                System.out.println(company.getInfo());
                display((ConcreteCompany) company);
            }
        }
    }
}
