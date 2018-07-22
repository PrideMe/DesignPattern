package com.wang.behavioral.command;

import javax.swing.*;

/**
 * @author wang.
 * @date 2018/7/22.
 * Description:
 */
public class ExitCommand extends JButton implements MyCommand {

    public ExitCommand(String text) {
        super(text);
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
