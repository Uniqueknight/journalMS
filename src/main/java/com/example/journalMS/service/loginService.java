package com.example.journalMS.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface loginService {


    public boolean userlogin(HttpServletRequest request, HttpServletResponse response);

    public boolean adminLogin(HttpServletRequest request, HttpServletResponse response);



}
