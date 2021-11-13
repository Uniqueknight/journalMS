package com.example.journalMS.web.controller;

import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "uAddJournalServlet", value = "/uAddJournalServlet")
public class uAddJournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = (String) request.getSession().getAttribute("info");
        String jourName = request.getParameter("jourName");

        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        uCenterServiceImpt.addJournal(jourName,userName);
        request.getRequestDispatcher("userCenter.jsp").forward(request,response);
    }
}
