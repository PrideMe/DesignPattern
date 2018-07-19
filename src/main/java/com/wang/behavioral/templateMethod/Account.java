package com.wang.behavioral.templateMethod;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:
 */
public abstract class Account {
    //账号
    private String accountNumber;

    public Account() {
        this.accountNumber = null;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    protected abstract String getAccountType();

    protected abstract double getInterestRate();

    //根据账户类型和账号确定该账号下有多少钱，象征性的返回一个值
    public double calculateAmount(String accountType,String accountNumber) {
        return 4567.00d;
    }

    //模板方法
    public double calculateInterest() {
        String accountType = getAccountType();
        double interestRate = getInterestRate();
        double amount = calculateAmount(accountType, accountNumber);
        return amount * interestRate;
    }
}
