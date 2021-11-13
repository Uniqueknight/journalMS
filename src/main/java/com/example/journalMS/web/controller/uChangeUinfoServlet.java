package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "uChangeUinfoServlet", value = "/uChangeUinfoServlet")
public class uChangeUinfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //判断是否登录
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

        //若登录再进行下一步数据的读取、显示
        //按下提交键是将数据录入数据库，Ajax会在之后刷新content内容
        //如此一来，提交按钮就必须带上class,以保障ajax的工作

        String passWord = request.getParameter("passWord");
        String sex = request.getParameter("sex");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String age = request.getParameter("age");

        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        uCenterServiceImpt.changeUserInfo(new userInfo(userName,passWord,sex,email,phone,city,age));
        request.getRequestDispatcher("userCenter.jsp").forward(request,response);

    }
}
