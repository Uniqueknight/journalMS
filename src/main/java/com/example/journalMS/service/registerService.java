package com.example.journalMS.service;

import com.example.journalMS.domain.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface registerService {

    //使用JDBC进行数据的入库
    public boolean register(user usr);

    //验证数据的合理性
    //验证姓名
    public boolean checkUserName(String name);
    //验证密码
    public boolean checkPassWord(String name);







}
