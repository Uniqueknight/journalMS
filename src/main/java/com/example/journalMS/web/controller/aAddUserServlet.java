package com.example.journalMS.web.controller;

import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.aCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "aAddUserServlet", value = "/aAddUserServlet")
public class aAddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String age = request.getParameter("age");

        new aCenterServiceImpt().addUser(new userInfo(userName,passWord,sex,email,phone,city,age));
        request.getRequestDispatcher("adminCenter.jsp").forward(request,response);
    }
}
