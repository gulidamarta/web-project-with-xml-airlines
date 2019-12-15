package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.exception.ServiceException;
import com.lowcostairline.service.impl.AircraftServiceImpl;

import java.util.Objects;

public class RemoveAircraft implements Command {
    @Override
    public void execute(){
        AircraftServiceImpl aircraftService = new AircraftServiceImpl();
        Aircraft aircraft = new Aircraft();

        System.out.println("Enter aircraft\'s model:");
        String model = Reader.nextString();

        System.out.println("Enter amount of seats:");
        // TODO: Checking type info
        int amountSeats = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter type of the aircraft: ");
        String type = Reader.nextString();

        System.out.println("Enter amount of fuel supply: ");
        int fuelSupply = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Is luggage compartment: ");
        boolean isLuggageCompartement = Boolean.parseBoolean(Objects.requireNonNull(Reader.nextString()));

        System.out.println("Enter amount of emergency exits: ");
        int emergencyExitAmount = Integer.parseInt(Objects.requireNonNull(Reader.nextString()));

        aircraft.setModel(model);
        aircraft.setTankCapacity(fuelSupply);
        aircraft.setSeatAmount(amountSeats);

        try {
            aircraftService.remove(aircraft);
        }catch (ServiceException e){
            System.out.println("You cannot remove that aircraft.");
        }
    }
}
