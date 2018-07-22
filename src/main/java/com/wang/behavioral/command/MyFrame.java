package com.wang.behavioral.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class MyFrame extends JFrame implements ActionListener {
    private JPanel jPanel;
    private YellowCommand yellowCommand;
    private RedCommand redCommand;
    private ExitCommand exitCommand;

    public MyFrame() throws HeadlessException {
        super("命令模式");
        jPanel = new JPanel();
        this.add(jPanel);
        yellowCommand = new YellowCommand("黄色", jPanel);
        redCommand = new RedCommand("红色", jPanel);
        exitCommand = new ExitCommand("退出");
        jPanel.add(yellowCommand);
        jPanel.add(redCommand);
        jPanel.add(exitCommand);
        yellowCommand.addActionListener(this);
        redCommand.addActionListener(this);
        exitCommand.addActionListener(this);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand command = (MyCommand) e.getSource();
        command.execute();
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
