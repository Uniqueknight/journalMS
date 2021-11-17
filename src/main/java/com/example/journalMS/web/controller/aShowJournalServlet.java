package com.example.journalMS.web.controller;

import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.aCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "aShowJournalServlet", value = "/aShowJournalServlet")
public class aShowJournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<journal> journalAll = new aCenterServiceImpt().getJournalAll();
        request.setAttribute("journalList",journalAll);
        request.getRequestDispatcher("aShowJournal.jsp").forward(request,response);
    }
}
