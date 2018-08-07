package com.wang.behavioral.state;

/**
 * @author wang.
 * @date 2018/8/7.
 * Description:环境角色
 */
public class TV {
    private final static Channel CCTV1 = new CCTV1();
    private final static Channel CCTV2 = new CCTV2();
    private final static Channel CCTV3 = new CCTV3();
    private Channel channel;

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public void disCCTV1() {
        this.setChannel(CCTV1);
        this.channel.display();
    }

    public void disCCTV2() {
        this.setChannel(CCTV2);
        this.channel.display();
    }

    public void disCCTV3() {
        this.setChannel(CCTV3);
        this.channel.display();
    }
}
