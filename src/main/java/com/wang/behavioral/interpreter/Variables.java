package com.wang.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:环境角色
 */
public class Variables {
    private Map<Variable, Integer> variableIntegerMap = new HashMap<>();

    public void put(Variable variable,int value) {
        variableIntegerMap.put(variable, value);
    }

    public int get(Variable variable) {
        return variableIntegerMap.get(variable);
    }
}
