package com.example.journalMS.dao;

import com.example.journalMS.domain.user;

import java.util.List;

public interface loginUserDao {

    public void save(user usr);

    public void delete(String useName);

    public void update(String useName, user usr);

    public user get(String useName);

    public List<user> getAll();

    public boolean find(String useName, String passWord);



}
