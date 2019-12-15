package com.lowcostairline.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AircraftServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        /*
        int currentPage = Integer.valueOf(request.getParameter("currentPage"));
        int recordsPerPage = Integer.valueOf(request.getParameter("recordsPerPage"));

        List<Faculty> faculties = SaxHandler.getInstance().getFacultyList();
        int rows = faculties.size();

        if (currentPage * recordsPerPage >= rows) {
            request.setAttribute("faculties", faculties.subList((currentPage - 1) * recordsPerPage, rows));
        } else {
            request.setAttribute("faculties", faculties.subList((currentPage - 1) * recordsPerPage, currentPage * recordsPerPage));
        }

        int nOfPages = rows / recordsPerPage;

        if (nOfPages % recordsPerPage > 0) {
            nOfPages++;
        }

        request.setAttribute("noOfPages", nOfPages);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("recordsPerPage", recordsPerPage);
        */
        request.getRequestDispatcher("jsp/faculties.jsp").forward(request, response);

    }
}
