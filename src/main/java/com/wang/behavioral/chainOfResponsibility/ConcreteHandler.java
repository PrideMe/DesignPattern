package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class ConcreteHandler extends Handler {
    @Override
    public void handlerRequest() {
        if (getSuccessor() != null) {
            System.out.println("请求传递给" + getSuccessor());
            getSuccessor().handlerRequest();
        } else {
            System.out.println("请求处理");
        }
    }
}
