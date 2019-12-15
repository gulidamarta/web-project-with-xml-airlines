package com.lowcostairline.controller;

import com.lowcostairline.beans.aircraft.Aircrafts;
import com.lowcostairline.beans.lowCostAirlines.LowCostAirlines;
import com.lowcostairline.controller.command.Command;
import com.lowcostairline.controller.command.impl.DisplayHelp;
import com.lowcostairline.reader.Reader;
import com.lowcostairline.writer.XmlWriter;
import com.lowcostairline.writer.exception.XmlOutInException;

public class Controller {

    public void writeToFile(){
        LowCostAirlines lowCostAirlines = new LowCostAirlines();

        XmlWriter xmlWriter = new XmlWriter();
        try {
            xmlWriter.Write(lowCostAirlines, "lowcost.xml");
        }catch (XmlOutInException e){
            System.out.println("Cannot write to the file.");
        }
    }

    public void WriteAircraftToFile(){
        Aircrafts aircraft = new Aircrafts();

        XmlWriter xmlWriter = new XmlWriter();
        try{
            xmlWriter.WriteAircraft(aircraft, "aircraft.xml");
        } catch (XmlOutInException e){
            System.out.println("Error while writing to file.");
        }
    }

    public void execute(){
        Command displayHelp = new DisplayHelp();
        displayHelp.execute();

        int result = Reader.nextInt();

        try {
            while (result != 0) {
                CommandName ct = ConsoleCommand.getCommandTypeByNumber(result);
                ct.getCommand().execute();
                result = Reader.nextInt();
            }
            ConsoleCommand
                    .getCommandTypeByNumber(result)
                    .getCommand()
                    .execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
