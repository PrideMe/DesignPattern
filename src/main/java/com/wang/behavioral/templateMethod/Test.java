package com.wang.behavioral.templateMethod;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
//        AbstractClass abstractClass = new ConcreteClass();
//        abstractClass.templateMethod();
        Account account = new DemandAccount();
        System.out.println(account.getAccountType() + ":" + account.calculateInterest());
        account = new FixedAccount();
        System.out.println(account.getAccountType() + ":" + account.calculateInterest());
    }
}
