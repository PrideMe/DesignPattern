package com.wang.behavioral.interpreter;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:抽象解释器-算术表达式
 */
public interface ArithmeticExpression {
    int interpret(Variables variables);
}
