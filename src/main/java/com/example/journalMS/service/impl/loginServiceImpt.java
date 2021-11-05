package com.example.journalMS.service.impl;

import com.example.journalMS.dao.impl.loginAdminImpt;
import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.service.loginService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServiceImpt implements loginService {



    @Override
    public boolean userlogin(HttpServletRequest request, HttpServletResponse response) {

        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String account = request.getParameter("account");

        if (account==null){
            System.out.print("account是空的");
            System.out.println("STOP Stop");
            return false;
        }

        if (account.equals("user")) {
            loginUserImpt userImpt = new loginUserImpt();
            if (userImpt.find(userName,passWord)){

                // TODO: 2021/11/5

                return true;
            }else {
                return false;
            }
        }else {
            loginAdminImpt adminImpt = new loginAdminImpt();
            if (adminImpt.find(userName,passWord)){

                // TODO: 2021/11/5

                return true;
            }else {
                return false;
            }
        }

    }

    @Override
    public boolean adminLogin(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }
}
