package com.example.journalMS.service.impl;

import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.domain.user;
import com.example.journalMS.service.registerService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServiceImpt implements registerService {

    @Override
    public boolean register(user usr) {

            new loginUserImpt().save(usr);
            return true;

    }

    @Override
    public boolean checkUserName(String username) {
        if (username == null || username.trim().equals("")) {
            return false;
        }

        return true;
    }

    @Override
    public boolean checkPassWord(String passWord) {
        if (passWord == null || passWord.trim().equals("")) {
            return false;
        }

        return true;
    }
}
