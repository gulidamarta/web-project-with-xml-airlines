package com.lowcostairline.controller.command.impl;

import com.lowcostairline.controller.ConsoleCommand;
import com.lowcostairline.controller.command.Command;

public class DisplayHelp implements Command {
    @Override
    public void execute(){
        for (ConsoleCommand cc : ConsoleCommand.values()) {
            System.out.println(cc.getNumber() + " - " + cc.getMessage());
        }
    }
}
