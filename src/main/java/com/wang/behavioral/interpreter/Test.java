package com.wang.behavioral.interpreter;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        Variables variables = new Variables();
        Variable x = new Variable();
        Variable y = new Variable();
        Variable z = new Variable();

        variables.put(x,10);
        variables.put(y,20);
        variables.put(z,30);

        ArithmeticExpression expression = new Plus(new Multiply(x, new Plus(y, new Division(z, x))), x);
        System.out.println(expression.interpret(variables));
    }
}
