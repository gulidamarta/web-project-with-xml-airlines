package com.lowcostairline.command;

import com.lowcostairline.command.common.GetAircraftsCommand;
import com.lowcostairline.command.common.GetPilotsCommand;
import com.lowcostairline.command.common.RegisterCommand;

import java.util.HashMap;
import java.util.Map;

public enum CommandType {
    COMMON_REGISTER(new RegisterCommand()),
    GET_AIRCRAFTS(new GetAircraftsCommand()),
    GET_PILOTS(new GetPilotsCommand());

    private Command command;

    CommandType(Command command) {
        this.command = command;
    }

    public Command getCurrentCommand() {
        return command;
    }

    private static final Map<String, CommandType> lookup = new HashMap<>();

    static {
        for (CommandType env : CommandType.values()) {
            lookup.put(env.toString(), env);
        }
    }

    public static CommandType getCommand(String type) {
        return lookup.get(type);
    }
}
