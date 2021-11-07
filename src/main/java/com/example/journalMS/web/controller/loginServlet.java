package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.domain.user;
import com.example.journalMS.service.impl.loginServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("CALL ME");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        loginServiceImpt loginServiceImpt = new loginServiceImpt();
        boolean state = loginServiceImpt.userlogin(request,response);

        if(state==true){
            // TODO: 2021/11/7

//            request.getSession().setAttribute("user", user);
            String message = String.format(
                    "恭喜：%s,登陆成功！本页将在3秒后跳到首页！！<meta http-equiv='refresh' content='3;url=%s'",
//                    user.getUserName(),
                    request.getContextPath()+"/index.jsp");
            request.setAttribute("message",message);
            request.getRequestDispatcher("/message.jsp").forward(request, response);

        }else {

        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
