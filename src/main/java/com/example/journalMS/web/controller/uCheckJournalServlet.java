package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "uCheckJournalServlet", value = "/uCheckJournalServlet")
public class uCheckJournalServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userName = (String) request.getSession().getAttribute("info");
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();

        //检验是否登录
        if (userName==null || !userInfoDaoImpt.existX(userName)){
            String message = String.format(
                    "<font size=\"10\" color=\"\">当前用户未登录！</font>");
            request.setAttribute("message",message);
            request.getRequestDispatcher("callBack.jsp").forward(request,response);
            return;
        }

        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        List<journal> userJournal = uCenterServiceImpt.getUserJournal(userName);
        request.getSession().setAttribute("journalList",userJournal);

        request.getRequestDispatcher("uShowJournal.jsp").forward(request,response);



    }
}
