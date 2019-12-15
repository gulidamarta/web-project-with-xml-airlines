package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.exception.ServiceException;
import com.lowcostairline.service.impl.AircraftServiceImpl;

import java.util.Objects;

public class AddNewAircraft implements Command {
    @Override
    public void execute(){
        AircraftServiceImpl aircraftService = new AircraftServiceImpl();

        System.out.println("Enter aircraft\'s model:");
        String model = Reader.nextString();

        System.out.println("Enter amount of seats:");
        int amountSeats = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));


        System.out.println("Enter amount of fuel supply: ");
        int fuelSupply = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));


        Aircraft aircraft = new Aircraft();
        aircraft.setModel(model);
        aircraft.setSeatAmount(amountSeats);
        aircraft.setTankCapacity(fuelSupply);

        try {
            aircraftService.add(aircraft);
        }
        catch (ServiceException e){
            //
        }
    }
}
