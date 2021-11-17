package com.example.journalMS.service.impl;

import com.example.journalMS.dao.impl.journalDaoImpt;
import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.user;
import com.example.journalMS.domain.userInfo;
import com.example.journalMS.service.aCenterService;

import java.util.List;

public class aCenterServiceImpt implements aCenterService {
    @Override
    public void addJournal(journal jour) {
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        journalDaoImpt.save(jour);
    }

    @Override
    public void addUser(userInfo uInfo) {
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        userInfoDaoImpt.save(uInfo);
        new loginUserImpt().save(new user(uInfo.getUserName(),uInfo.getPassWord()));
    }

    @Override
    public void getJournal(String jourName) {
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        journalDaoImpt.get(jourName);
    }

    @Override
    public void getUser(String userName) {
        new userInfoDaoImpt().get(userName);
    }

    @Override
    public List<journal> getJournalAll() {
       return new journalDaoImpt().getAll();
    }

    @Override
    public List<userInfo> getUserInfoAll() {
        return new userInfoDaoImpt().getAll();
    }

    @Override
    public void changeJournal(String jourName,journal jour) {
        new journalDaoImpt().update(jourName,jour);
    }

    @Override
    public void changeUserName(String userName,userInfo user) {
        new userInfoDaoImpt().update(userName,user);
    }

    @Override
    public void deleteJournal(String jourName) {
        new journalDaoImpt().delete(jourName);
    }

    @Override
    public void deleteUserInfo(String userName) {
        new userInfoDaoImpt().delete(userName);
        new loginUserImpt().delete(userName);
    }
}
