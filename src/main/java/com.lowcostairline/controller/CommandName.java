package com.lowcostairline.controller;

import com.lowcostairline.controller.command.Command;
import com.lowcostairline.controller.command.impl.*;

enum  CommandName {
    ADD_AIRCRAFT        (new AddNewAircraft()),
    ADD_PILOT           (new AddNewPilot()),
    ADD_STEWARD         (new AddNewSteward()),
    DISMISS_PILOT       (new DismissPilot()),
    DISMISS_STEWARD     (new DismissSteward()),
    EDIT_AIRCRAFT_INFO  (new EditAircrfatInfo()),
    EDIT_PILOT_INFO     (new EditPilotInfor()),
    EDIT_STEWARD_INFO   (new EditStewardInfo()),
    REMOVE_AIRCRAFT     (new RemoveAircraft()),
    DISPLAY_HELP        (new DisplayHelp());

    private Command command;
    CommandName(Command command){
        this.command = command;
    }

    public Command getCommand(){
        return command;
    }
}
