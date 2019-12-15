package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.crew.AircraftCrew;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.impl.PilotServiceImpl;

import java.util.Objects;

public class DismissPilot implements Command {
    @Override
    public void execute(){
        PilotServiceImpl pilotService = new PilotServiceImpl();

        String[] params = new String[3];

        System.out.println("Enter name of the pilot: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the pilot: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        int workExperience = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter the job description: ");
        String jobDescription = Reader.nextString();

        System.out.println("Enter salary of the steward: ");
        int salary = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        AircraftCrew pilot = new AircraftCrew();
        pilot.setName(name);
        pilot.setLastName(surname);
        pilot.setWorkExperience(workExperience);
        pilot.setJobDescription(jobDescription);
        pilot.setSalary(salary);

        try{
            pilotService.remove(pilot);
        }
        catch (Exception e){
            //TODO: throw command exception
            System.out.println("Cannot dismiss pilot information.");
        }
    }
}
