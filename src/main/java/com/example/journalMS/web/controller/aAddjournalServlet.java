package com.example.journalMS.web.controller;

import com.example.journalMS.domain.journal;
import com.example.journalMS.service.aCenterService;
import com.example.journalMS.service.impl.aCenterServiceImpt;
import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "aAddjournalServlet", value = "/aAddjournalServlet")
public class aAddjournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String jourName = request.getParameter("jourName");
        String jourNum = request.getParameter("jourNum");
        String jourType = request.getParameter("jourType");
        String jourPrice = request.getParameter("jourPrice");
        String jourYear = request.getParameter("jourYear");
        String jourPart = request.getParameter("jourPart");

        aCenterServiceImpt aCenterServiceImpt = new aCenterServiceImpt();
        aCenterServiceImpt.addJournal(new journal(jourName,jourNum,jourType,jourPrice,jourYear,jourPart));
        request.getRequestDispatcher("adminCenter.jsp").forward(request,response);
    }
}
