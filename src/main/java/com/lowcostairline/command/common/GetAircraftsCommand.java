package com.lowcostairline.command.common;

import com.lowcostairline.beans.aircraft.Aircraft;
import com.lowcostairline.beans.airline.lowCostAirline.LowCostAirlineTrip;
import com.lowcostairline.command.Command;
import com.lowcostairline.command.Page;
import com.lowcostairline.exception.ParserException;
import com.lowcostairline.parsers.xml.PlanHandler;
import com.lowcostairline.parsers.xml.SaxParser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

public class GetAircraftsCommand implements Command {
    @Override
    public Page execute(HttpServletRequest request) throws ParserException {
        String xmlPath = "C:/Users/marta/Downloads/Marta_Java/lab3/lab3/lowcost.xml";

        HttpSession session = request.getSession();
        SaxParser saxParser = new SaxParser(new PlanHandler());
        List<LowCostAirlineTrip> list1 = saxParser.parse(xmlPath);
        List<Aircraft> list = Arrays.asList(list1.get(0).getAircraft(),list1.get(1).getAircraft());
        session.setAttribute("list", list);

        return new Page("/jsp/aircrafts.jsp", true);
    }
}
