package com.example.journalMS.service.impl;

import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.userService;

import java.util.ArrayList;

public class userServiceImpt implements userService {

    @Override
    public userInfo uUserInfoSelect(String userName) {

        userInfoDaoImpt uInfoDaoImpt = new userInfoDaoImpt();

        return uInfoDaoImpt.get(userName);
    }

    @Override
    public ArrayList<journal> uJourInfoSelect(String jourName) {
        return null;
    }

    @Override
    public void uUserChange(userInfo userName) {

    }

    @Override
    public void uJourChange(String jourName) {

    }

    @Override
    public void uJourDelete(String jourName) {

    }
}
