package com.example.journalMS.service;

import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.user;
import com.example.journalMS.domain.userInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface adminService {

    //查询特定用户信息
    public void aUserInfoSelect(String userName);
    //查询所有用户信息
    public void aUserInfoSelectAll();
    //查询特定期刊信息
    public void aJourSelect(String jourName);
    //查询所有期刊信息
    public void aJourSelectAll();
    //修改特定用户信息
    public void aUserInfoChange(userInfo usr);
    //修改特定期刊信息
    public void aJourChange(journal jour);
    //统计报刊，以用户
    public void aSumByUser();
    //统计报刊，以部门
    public void aSumByPart();
    //统计报刊，以期刊
    public void aSumByJour();













}
