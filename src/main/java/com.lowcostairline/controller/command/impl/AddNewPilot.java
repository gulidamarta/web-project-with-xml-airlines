package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.crew.AircraftCrew;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.exception.ServiceException;
import com.lowcostairline.service.impl.PilotServiceImpl;

import java.util.Objects;

public class AddNewPilot implements Command {
    @Override
    public void execute(){
        PilotServiceImpl pilotService = new PilotServiceImpl();

        System.out.println("Enter name of the pilot: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the pilot: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience");
        int workExperience = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        AircraftCrew pilot = new AircraftCrew();
        pilot.setName(name);
        pilot.setLastName(surname);
        pilot.setWorkExperience(workExperience);

        try{
            pilotService.add(pilot);
        }
        catch (ServiceException e){
            // TODO: throw controller exception
            System.out.println("Cannot add new pilot.");
        }
    }
}
