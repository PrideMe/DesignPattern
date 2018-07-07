package com.wang.structural.proxy;

/**
 * @author wang.
 * @date 2018/7/7.
 * Description:
 */
public class ProxySubject implements Subject {
    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.beforeRequest();
        subject.request();
        this.afterRequest();
    }

    public void beforeRequest() {
        System.out.println("执行前的准备");
    }

    public void afterRequest() {
        System.out.println("执行后的收尾");
    }
}
