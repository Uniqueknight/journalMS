package com.example.journalMS.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface adminService {


    public void aUserInfoSelect(HttpServletRequest request, HttpServletResponse response);

    public void aJourSelect(HttpServletRequest request,HttpServletResponse response);

    public void aUserInfoChange(HttpServletRequest request,HttpServletResponse response);

    public void aJourChange(HttpServletRequest request,HttpServletResponse response);

    public void aSumByUser(HttpServletRequest request,HttpServletResponse response);

    public void aSumByPart(HttpServletRequest request,HttpServletResponse response);

    public void aSumByJour(HttpServletRequest request,HttpServletResponse response);













}
