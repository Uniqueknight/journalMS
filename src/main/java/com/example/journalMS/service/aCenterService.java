package com.example.journalMS.service;

import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.user;
import com.example.journalMS.domain.userInfo;

import java.util.List;

public interface aCenterService {

    public void addJournal(journal jour);

    public void addUser(userInfo uInfo);

    public void getJournal(String jourName);

    public void getUser(String userName);

    public List<journal> getJournalAll();

    public List<userInfo> getUserInfoAll();

    public void changeJournal(String jourName,journal jour);

    public void changeUserName(String userName,userInfo user);

    public void deleteJournal(String jourName);

    public void deleteUserInfo(String userName);

}
