package com.example.journalMS.dao;

import com.example.journalMS.domain.admin;
import com.example.journalMS.domain.jourUser;
import com.example.journalMS.domain.user;

import java.util.List;

public interface jourUserDao {

    public void save(jourUser jusr);

    public void delete(String jourName,String userName);

    public void update(String jourName,String userName, jourUser jusr);

    public jourUser get(String jourName,String userName);

    public List<jourUser> getAll();

    public boolean existX(String jourName,String userName);


}
