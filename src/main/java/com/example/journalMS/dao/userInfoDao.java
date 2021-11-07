package com.example.journalMS.dao;

import com.example.journalMS.domain.admin;
import com.example.journalMS.domain.userInfo;

import java.util.List;

public interface userInfoDao {


    public void save(userInfo user);

    public void delete(String useName);

    public void update(String useName, userInfo uInfo);

    public userInfo get(String useName);

    public List<userInfo> getAll();











}
