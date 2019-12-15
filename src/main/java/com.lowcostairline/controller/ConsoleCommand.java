package com.lowcostairline.controller;

import java.util.HashMap;
import java.util.Map;

import static com.lowcostairline.controller.CommandName.*;


public enum ConsoleCommand {
    A(1, "add pilot", ADD_PILOT),
    B(2, "add aircraft", ADD_AIRCRAFT),
    C(3, "add steward", ADD_STEWARD),
    D(4, "dismiss pilot", DISMISS_PILOT),
    E(5, "dismiss steward", DISMISS_STEWARD),
    F(6, "display help", DISPLAY_HELP),
    G(7, "edit aircraft information", EDIT_AIRCRAFT_INFO),
    H(8, "edit pilot information", EDIT_PILOT_INFO),
    K(9, "edit steward information", EDIT_STEWARD_INFO),
    L(10, "remove aircraft", REMOVE_AIRCRAFT);

    private String message;
    private int number;
    private CommandName commandName;

    ConsoleCommand(int number, String message, CommandName commandName){
        this.number = number;
        this.message = message;
        this.commandName = commandName;
    }

    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    public CommandName getCommandName() {
        return commandName;
    }

    private static final Map<Integer, ConsoleCommand> lookup = new HashMap<>();

    static {
        for (ConsoleCommand cc : ConsoleCommand.values()) {
            lookup.put(cc.number, cc);
        }
    }

    public static CommandName getCommandTypeByNumber(int number) {
        ConsoleCommand ct = lookup.get(number);
        return ct == null ? DISPLAY_HELP : ct.getCommandName();
    }
}
