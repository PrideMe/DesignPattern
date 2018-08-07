package com.wang.behavioral.interpreter;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:终结符表达式
 */
public class Variable implements ArithmeticExpression {
    @Override
    public int interpret(Variables variables) {
        return variables.get(this);
    }
}
