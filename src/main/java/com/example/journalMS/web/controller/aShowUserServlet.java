package com.example.journalMS.web.controller;

import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.aCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "aShowUserServlet", value = "/aShowUserServlet")
public class aShowUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        aCenterServiceImpt aCenterServiceImpt = new aCenterServiceImpt();
        List<userInfo> userInfoAll = aCenterServiceImpt.getUserInfoAll();
        request.setAttribute("userList",userInfoAll);
        request.getRequestDispatcher("aShowUser.jsp").forward(request,response);
    }
}
