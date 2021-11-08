package com.example.journalMS.service.impl;

import com.example.journalMS.service.registerService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class registerServiceImpt implements registerService {


    @Override
    public boolean register(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }

    @Override
    public boolean checkUserName(String name) {
        return false;
    }

    @Override
    public boolean checkPassWord(String name) {
        return false;
    }
}
