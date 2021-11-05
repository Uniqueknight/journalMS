package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.service.impl.loginServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/FFF")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CALL ME");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        loginServiceImpt loginServiceImpt = new loginServiceImpt();
        boolean num = loginServiceImpt.userlogin(request,response);

        loginUserImpt userImpt = new loginUserImpt();
        userImpt.get("root");
        PrintWriter writer = response.getWriter();
        writer.println(userImpt.get("root"));



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
