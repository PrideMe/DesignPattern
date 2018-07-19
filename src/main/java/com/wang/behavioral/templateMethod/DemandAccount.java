package com.wang.behavioral.templateMethod;

/**
 * @author wang.
 * @date 2018/7/19.
 * Description:活期账户
 */
public class DemandAccount extends Account {
    @Override
    protected String getAccountType() {
        return "活期";
    }

    @Override
    protected double getInterestRate() {
        return 0.005d;
    }
}
