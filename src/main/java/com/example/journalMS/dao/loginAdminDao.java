package com.example.journalMS.dao;

import com.example.journalMS.domain.admin;

import java.util.List;

public interface loginAdminDao {

    public void save(admin adm);

    public void delete(String useName);

    public void update(String useName, admin adm);

    public admin get(String useName);

    public List<admin> getAll();

    public boolean find(String useName, String password);

}
