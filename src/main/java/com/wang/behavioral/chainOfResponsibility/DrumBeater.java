package com.wang.behavioral.chainOfResponsibility;

/**
 * @author wang.
 * @date 2018/7/24.
 * Description:
 */
public class DrumBeater {
    public static void main(String[] args) {
        Player player = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));
        player.handler(3);
    }
}
