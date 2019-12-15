package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.crew.AircraftCrew;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.exception.ServiceException;
import com.lowcostairline.service.impl.StewardServiceImpl;

import java.util.Objects;

public class DismissSteward implements Command {
    @Override
    public void execute(){
        StewardServiceImpl stewardService = new StewardServiceImpl();

        System.out.println("Enter name of the steward: ");
        String name = Reader.nextString();

        System.out.println("Enter surname of the steward: ");
        String surname = Reader.nextString();

        System.out.println("Enter amount of working experience: ");
        int workExperience = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter the job description: ");
        String jobDescription = Reader.nextString();

        System.out.println("Enter salary of the steward: ");
        int salary = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        AircraftCrew steward = new AircraftCrew();
        steward.setName(name);
        steward.setLastName(surname);
        steward.setWorkExperience(workExperience);
        steward.setJobDescription(jobDescription);
        steward.setSalary(salary);

        try{
            stewardService.remove(steward);
        }catch(ServiceException e){
            // TODO: throw Controller exception
        }

    }
}
