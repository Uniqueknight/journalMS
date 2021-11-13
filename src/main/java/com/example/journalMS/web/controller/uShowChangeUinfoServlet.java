package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "uShowChangeUinfoServlet", value = "/uShowChangeUinfoServlet")
public class uShowChangeUinfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = (String) request.getSession().getAttribute("info");
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();

        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        userInfo userInfo = uCenterServiceImpt.getUserInfo(userName);
        request.setAttribute("userInfo",userInfo);
        request.getRequestDispatcher("uShowChangeUinfo.jsp").forward(request,response);

    }
}
