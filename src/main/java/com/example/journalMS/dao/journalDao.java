package com.example.journalMS.dao;

import com.example.journalMS.domain.admin;
import com.example.journalMS.domain.journal;

import java.util.List;

public interface journalDao {

    public void save(journal jour);

    public void delete(String jourName);

    public void update(String jourName, journal jour);

    public journal get(String jouName);

    public List<journal> getAll();














}
