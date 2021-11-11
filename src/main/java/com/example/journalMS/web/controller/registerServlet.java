package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.domain.user;
import com.example.journalMS.service.impl.registerServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "registerServlet", value = "/registerServlet")
public class registerServlet extends HttpServlet {

    private String userName = null;
    private String passWord = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        userName = request.getParameter("userName");
        passWord = request.getParameter("passWord");
        registerServiceImpt reSerImpt = new registerServiceImpt();
        if (reSerImpt.checkUserName(userName)&&reSerImpt.checkPassWord(passWord)){
            //获取当前时间
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");
            String ns = dateTime.format(formatter);

            //存入数据库
            loginUserImpt userImpt = new loginUserImpt();
            userImpt.save(new user(userName,passWord,ns));

            String message = String.format(
                    "注册成功！2秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='2;url=%s'",
                    request.getContextPath()+"/login");
            request.setAttribute("message",message);
            request.getRequestDispatcher("callBack.jsp").forward(request,response);
        }else {
            String message = String.format(
                    "请不要输入空的用户名或密码！！请重新填写信息！2秒后为您自动跳到注册页面！！<meta http-equiv='refresh' content='2;url=%s'",
                    request.getContextPath()+"/register");
            request.setAttribute("message",message);
            request.getRequestDispatcher("callBack.jsp").forward(request,response);
        }
    }
}
