package com.wang.creational.singleton;

/**
 * @author wang.
 * @date 2018/7/2.
 * Description:
 */
public class NumberThread extends Thread {
    private String threadName;

    public NumberThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        GlobalNum globalNum = GlobalNum.getGlobalNum();
        System.out.println(globalNum);
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName+"第"+globalNum.getNum()+"次访问");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
