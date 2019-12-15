package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.crew.AircraftCrew;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.impl.PilotServiceImpl;

public class EditPilotInfor implements Command {
    @Override
    public void execute(){
        PilotServiceImpl pilotService = new PilotServiceImpl();

        AircraftCrew pilot = new AircraftCrew();

        String[] params = new String[3];

        System.out.println("Enter name of the pilot: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the pilot: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        String workExperience = Reader.nextString();

        params[0] = name;
        params[1] = surname;
        params[2] = workExperience;

        try{
            pilotService.edit(pilot, params);
        }
        catch (Exception e){
            //TODO: throw command exception
            System.out.println("Cannot edit pilot information.");
        }
    }
}
