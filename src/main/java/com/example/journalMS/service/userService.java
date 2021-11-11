package com.example.journalMS.service;

import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.userInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

public interface userService {
    //查看个人信息
    public userInfo uUserInfoSelect(String userName);
    //查看订阅信息
    public ArrayList<journal> uJourInfoSelect(String jourName);
    //修改信息
    public void uUserChange(userInfo userName);
    //订阅报纸
    public void uJourChange(String jourName);
    //撤销报刊
    public void uJourDelete(String jourName);














}
