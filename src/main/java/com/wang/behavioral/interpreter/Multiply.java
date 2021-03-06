package com.wang.behavioral.interpreter;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:
 */
public class Multiply implements ArithmeticExpression {
    private ArithmeticExpression left;
    private ArithmeticExpression right;

    public Multiply(ArithmeticExpression left, ArithmeticExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Variables variables) {
        return left.interpret(variables) * right.interpret(variables);
    }
}
