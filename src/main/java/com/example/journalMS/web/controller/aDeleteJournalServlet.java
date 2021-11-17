package com.example.journalMS.web.controller;

import com.example.journalMS.service.impl.aCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "aDeleteJournalServlet", value = "/aDeleteJournalServlet")
public class aDeleteJournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String jourName = request.getParameter("jourName");
        new aCenterServiceImpt().deleteJournal(jourName);
        request.getRequestDispatcher("adminCenter.jsp").forward(request,response);
    }
}
