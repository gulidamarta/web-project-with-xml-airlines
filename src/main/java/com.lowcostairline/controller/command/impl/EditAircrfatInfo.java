package com.lowcostairline.controller.command.impl;

import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.service.exception.ServiceException;
import com.lowcostairline.service.impl.AircraftServiceImpl;

public class EditAircrfatInfo implements Command {
    @Override
    public void execute() {
        AircraftServiceImpl aircraftService = new AircraftServiceImpl();
        String[] params = new String[6];

        System.out.println("Enter aircraft\'s model:");
        String model = Reader.nextString();

        System.out.println("Enter amount of seats:");
        // TODO: Checking type info
        String amountSeats = Reader.nextString();

        System.out.println("Enter type of the aircraft: ");
        String type = Reader.nextString();

        System.out.println("Enter amount of fuel supply: ");
        String fuelSupply = Reader.nextString();

        System.out.println("Is luggage compartment: ");
        String isLuggageCompartement = Reader.nextString();

        System.out.println("Enter amount of emergency exits: ");
        String emergencyExitAmount = Reader.nextString();

        Aircraft aircraft = new Aircraft();
        params[0] = model;
        params[1] = amountSeats;
        params[2] = type;
        params[3] = fuelSupply;
        params[4] = isLuggageCompartement;
        params[5] = emergencyExitAmount;

        try {
            aircraftService.edit(aircraft, params);
        } catch (
                ServiceException e) {
            //
        }
    }
}
