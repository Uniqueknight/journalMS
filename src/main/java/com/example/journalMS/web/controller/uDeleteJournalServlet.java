package com.example.journalMS.web.controller;

import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "uDeleteJournalServlet", value = "/uDeleteJournalServlet")
public class uDeleteJournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = (String) request.getSession().getAttribute("info");
        String jourName = request.getParameter("jourName");

        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        uCenterServiceImpt.deleteJournal(jourName,userName);
        request.getRequestDispatcher("userCenter.jsp").forward(request,response);
    }
}
