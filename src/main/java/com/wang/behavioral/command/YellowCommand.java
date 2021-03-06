package com.wang.behavioral.command;

import javax.swing.*;
import java.awt.*;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class YellowCommand extends JButton implements MyCommand {
    private JPanel jPanel;

    public YellowCommand(String text, JPanel jPanel) {
        super(text);
        this.jPanel = jPanel;
    }

    @Override
    public void execute() {
        jPanel.setBackground(Color.YELLOW);
    }
}
