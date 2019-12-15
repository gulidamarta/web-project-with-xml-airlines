package com.lowcostairline.beans.lowCostAirlines;


import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.beans.airline.lowCostAirline.LowCostAirlineTrip;
import com.lowcostairline.beans.crew.AircraftCrew;

import java.util.Objects;

public class LowCostAirlines{

    private LowCostAirlineTrip lowCostAirlineTripBlueSky;
    private LowCostAirlineTrip lowCostAirlineTripAmerican;

    public LowCostAirlines(){
        AircraftCrew pilot = new AircraftCrew();
        pilot.setName("Mark");
        pilot.setLastName("Lutz");
        pilot.setSalary(100);
        pilot.setJobDescription("Pilot");
        pilot.setWorkExperience(200);

        AircraftCrew steward = new AircraftCrew();
        steward.setName("Andrew");
        steward.setLastName("Gale");
        steward.setWorkExperience(200);
        steward.setJobDescription("Steward");
        steward.setSalary(100);

        Aircraft aircraft =  new Aircraft();
        aircraft.setModel("Airbus");
        aircraft.setSeatAmount(200);
        aircraft.setTankCapacity(5050);

        lowCostAirlineTripBlueSky = new LowCostAirlineTrip();
        lowCostAirlineTripBlueSky.setAircraft(aircraft);
        lowCostAirlineTripBlueSky.setPilot(pilot);
        lowCostAirlineTripBlueSky.setSteward(steward);
        lowCostAirlineTripBlueSky.setCategory("Middle");
        pilot = new AircraftCrew();
        pilot.setName("Jack");
        pilot.setLastName("Lop");
        pilot.setSalary(100);
        pilot.setJobDescription("Pilot");
        pilot.setWorkExperience(200);

        steward = new AircraftCrew();
        steward.setName("Mike");
        steward.setLastName("Bee");
        steward.setWorkExperience(200);
        steward.setJobDescription("Steward");
        steward.setSalary(100);

        aircraft =  new Aircraft();
        aircraft.setModel("Airbus");
        aircraft.setSeatAmount(200);
        aircraft.setTankCapacity(5050);

        lowCostAirlineTripAmerican = new LowCostAirlineTrip();
        lowCostAirlineTripAmerican.setPilot(pilot);
        lowCostAirlineTripAmerican.setAircraft(aircraft);
        lowCostAirlineTripAmerican.setSteward(steward);
        lowCostAirlineTripAmerican.setCategory("Middle");
    }

    public LowCostAirlineTrip getLowCostAirlineTripAmerican() {
        return lowCostAirlineTripAmerican;
    }

    public LowCostAirlineTrip getLowCostAirlineTripBlueSky(){
        return lowCostAirlineTripBlueSky;
    }

    @Override
    public int hashCode(){
        return Objects.hash(lowCostAirlineTripAmerican, lowCostAirlineTripBlueSky);
    }


    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }
        if (o == null
                || getClass()
                != o.getClass()) {
            return false;
        }

        LowCostAirlines that = (LowCostAirlines) o;

        if (lowCostAirlineTripAmerican.getAircraft() != that.lowCostAirlineTripAmerican.getAircraft()) {
            return false;
        }

        if (lowCostAirlineTripBlueSky.getAircraft() != that.lowCostAirlineTripBlueSky.getAircraft()){
            return false;
        }

        if (lowCostAirlineTripBlueSky.getSteward() != that.lowCostAirlineTripBlueSky.getSteward()){
            return false;
        }

        if (lowCostAirlineTripAmerican.getSteward() != that.lowCostAirlineTripAmerican.getSteward()) {
            return false;
        }

        if (lowCostAirlineTripBlueSky.getPilot() != that.lowCostAirlineTripBlueSky.getPilot()){
            return false;
        }

        if (lowCostAirlineTripAmerican.getPilot() != that.lowCostAirlineTripAmerican.getPilot()){
            return false;
        }

        if (!lowCostAirlineTripAmerican.getCategory().equals(that.lowCostAirlineTripAmerican.getCategory()))
        {
            return false;
        }

        return !lowCostAirlineTripBlueSky.getCategory().equals(that.lowCostAirlineTripBlueSky.getCategory());
    }

    @Override
    public String toString() {
        return "LowCostAirlines{" +
                "///}";
    }
}
