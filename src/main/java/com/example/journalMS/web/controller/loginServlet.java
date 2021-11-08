package com.example.journalMS.web.controller;

import com.example.journalMS.dao.impl.loginAdminImpt;
import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.domain.user;
import com.example.journalMS.service.impl.loginServiceImpt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet",value = "/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String account = request.getParameter("account");

        if (account==null){
            System.out.print("account是空的");
            System.out.println("STOP Stop");

            String message = String.format(
                    "对不起，用户名或密码有误！！请重新登录！2秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='2;url=%s'",
                    request.getContextPath()+"/servlet/Login");
            request.setAttribute("callBack",message);
            request.getRequestDispatcher("callBack.jsp").forward(request, response);
            return;

        }

        if (account.equals("user")) {
            loginUserImpt userImpt = new loginUserImpt();
            if (userImpt.find(userName,passWord)){
                //登陆成功就要跳转登录界面
                //现在的问题是如何判断登陆成功与登陆失败
                System.out.println("爷成功了");
                request.getRequestDispatcher("/userCenter").forward(request,response);
                // TODO: 2021/11/5
                return;

            }else {
                //登录失败就进行提示，并且返回原界面（刷新即可）
                System.out.println("5555");
                String message = String.format(
                        "对不起，用户名或密码有误！！请重新登录！2秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='2;url=%s'",
                        request.getContextPath()+"/login");
                request.setAttribute("message",message);
                request.getRequestDispatcher("/callBack.jsp").forward(request,response);
                // TODO: 2021/11/5
            }
        }else {//管理员登录

            loginAdminImpt adminImpt = new loginAdminImpt();
            if (adminImpt.find(userName,passWord)){
                System.out.println("这是管理员登录");
                request.getRequestDispatcher("/adminCenter").forward(request,response);
                // TODO: 2021/11/5

            }else {
                System.out.println("5555");
                String message = String.format(
                        "对不起，用户名或密码有误！！请重新登录！2秒后为您自动跳到登录页面！！<meta http-equiv='refresh' content='2;url=%s'",
                        request.getContextPath()+"/login");
                request.setAttribute("message",message);
                request.getRequestDispatcher("/callBack.jsp").forward(request,response);
            }
        }














//        System.out.println("CALL ME");
//        response.setHeader("content-type", "text/html;charset=UTF-8");
//        loginServiceImpt loginServiceImpt = new loginServiceImpt();
//        boolean state = loginServiceImpt.userlogin(request,response);
//
//        if(state==true){
//            // TODO: 2021/11/7
//
////            request.getSession().setAttribute("user", user);
//            String message = String.format(
//                    "恭喜：%s,登陆成功！本页将在3秒后跳到首页！！<meta http-equiv='refresh' content='3;url=%s'",
////                    user.getUserName(),
//                    request.getContextPath()+"/index.jsp");
//            request.setAttribute("message",message);
//            request.getRequestDispatcher("/message.jsp").forward(request, response);
//
//        }else {
//
//        }



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
