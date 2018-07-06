package com.wang.creational.prototype;

/**
 * @author wang.
 * @date 2018/7/6.
 * Description:
 */
public class ClientDemo {
    public static void main(String[] args) {
        Mail mail = new Mail("您的话费余额已不足！请及时充值");
        mail.setUsername("A");
        for (int i = 0; i < 10; i++) {
            Mail mail1 = mail.clone();
            mail.setUsername(String.valueOf(i)+"号");
            send(mail1);
        }
    }
    public static void send(Mail mail){
        System.out.println(mail.getUsername()+mail.getContent());
    }
}
