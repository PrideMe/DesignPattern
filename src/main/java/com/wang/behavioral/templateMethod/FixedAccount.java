package com.wang.behavioral.templateMethod;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:定期账户
 */
public class FixedAccount extends Account {
    @Override
    protected String getAccountType() {
        return "一年定期";
    }

    @Override
    protected double getInterestRate() {
        return 0.032d;
    }
}
