package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.journalDaoImpt;
import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "uShowGetJournalServlet", value = "/uShowGetJournalServlet")
public class uShowGetJournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        List<journal> journalList = journalDaoImpt.getAll();

        request.setAttribute("journalList",journalList);
        request.getRequestDispatcher("uShowGetJournal.jsp").forward(request,response);
    }
}
