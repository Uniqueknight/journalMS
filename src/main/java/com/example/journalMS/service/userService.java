package com.example.journalMS.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface userService {

    public void uUserInfoSelect(HttpServletRequest request, HttpServletResponse response);

    public void uJourInfoSelect(HttpServletRequest request,HttpServletResponse response);

    public void uUserChange(HttpServletRequest request,HttpServletResponse response);

    public void uJourChange(HttpServletRequest request,HttpServletResponse response);

    public void uJourDelete(HttpServletRequest request,HttpServletResponse response);














}
