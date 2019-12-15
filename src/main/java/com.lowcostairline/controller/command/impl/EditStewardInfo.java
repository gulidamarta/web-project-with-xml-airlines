package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.crew.AircraftCrew;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.impl.StewardServiceImpl;

public class EditStewardInfo implements Command {
    @Override
    public void execute(){
        StewardServiceImpl stewardService = new StewardServiceImpl();
        AircraftCrew steward = new AircraftCrew();
        String[] params = new String[6];

        System.out.println("Enter name of the steward: ");
        params[0] = Reader.nextString();

        System.out.println("Enter surname of the steward: ");
        params[1] = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        params[2] = Reader.nextString();


        try{
            stewardService.edit(steward, params);
        }
        catch (Exception e){
            //TODO: Throw Controller exception
            System.out.println("You cannot edit steward information.");
        }
    }
}
