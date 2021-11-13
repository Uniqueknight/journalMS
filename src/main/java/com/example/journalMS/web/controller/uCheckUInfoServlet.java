package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.impl.uCenterServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "uCheckUInfoServlet", value = "/uCheckUInfoServlet")
public class uCheckUInfoServlet extends HttpServlet {
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
                    "<font size=\"10\" color=\"\">当前用户未登录！！！</font>");
            request.setAttribute("message",message);
            request.getRequestDispatcher("callBack.jsp").forward(request,response);
            return;
        }
//        int b[] = {1,2,3,4,5,6,7};
        uCenterServiceImpt uCenterServiceImpt = new uCenterServiceImpt();
        userInfo userInfo1 = uCenterServiceImpt.getUserInfo(userName);
        request.setAttribute("userInfo",userInfo1);
//        request.setAttribute("num",b);
//        userInfo userInfo = userInfoDaoImpt.get(userName);
//        request.setAttribute("info",userInfo);
//        request.getRequestDispatcher("checkWindows.jsp").forward(request,response);
        request.getRequestDispatcher("uShowUser.jsp").forward(request,response);
    }
}
