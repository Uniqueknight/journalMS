package com.example.journalMS.service.impl;

import com.example.journalMS.dao.impl.jourUserDaoImpt;
import com.example.journalMS.dao.impl.journalDaoImpt;
import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.*;
import com.example.journalMS.service.uCenterService;

import java.util.ArrayList;
import java.util.List;

public class uCenterServiceImpt implements uCenterService{
    @Override
    public void addJournal(String jourName, String userName) {
        jourUserDaoImpt jourUserDaoImpt = new jourUserDaoImpt();
        //书库存在订阅数加一，不存在则新建数据插入
        if(jourUserDaoImpt.existX(jourName,userName)){
            int num = jourUserDaoImpt.get(jourName, userName).getNum();
            num++;//订阅数加一
            jourUser jusr = new jourUser(jourName, userName, num);
            jourUserDaoImpt.update(jusr.getJourName(),jusr.getUserName(),jusr);
            return;
        }else {
            jourUserDaoImpt.save(new jourUser(jourName,userName,1));
            return;
        }

    }

    @Override
    public void deleteJournal(String jourName, String userName) {
        jourUserDaoImpt jourUserDaoImpt = new jourUserDaoImpt();
        jourUserDaoImpt.delete(jourName,userName);
    }

    @Override
    public userInfo getUserInfo(String userName) {

        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        userInfo userInfo = userInfoDaoImpt.get(userName);
        return userInfo;
    }

    @Override
    public void changeUserInfo(userInfo uInfo) {
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        loginUserImpt userImpt = new loginUserImpt();

        userInfoDaoImpt.update(uInfo.getUserName(),uInfo);
        userImpt.update(uInfo.getUserName(),new user(uInfo.getUserName(),uInfo.getPassWord()));
    }

    @Override
    public List<journal> getUserJournal(String userName) {
        //通过jouruser表查找jourName
        //用jourName来查找对应的jourNal信息
        List<jourUser> jourUsers = new jourUserDaoImpt().select( userName);
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        ArrayList<journal> journals = new ArrayList<>();
        for (jourUser jourUser : jourUsers) {
            journals.add(journalDaoImpt.get(jourUser.getJourName()));
        }
        return journals;
    }

    //jourUser有Num
    //journal有Price
    //返回个对应顺序的Payment
    @Override
    public List<payment> getPayment(String userName) {
        //获取用户对应的期刊，并得到对应的num
        List<jourUser> jourUsers = new jourUserDaoImpt().select( userName);
        journalDaoImpt journalDaoImpt = new journalDaoImpt();
        ArrayList<payment> payments = new ArrayList<>();
        for (jourUser jourUser : jourUsers) {
            int num = jourUser.getNum();
            int jourPrice = Integer.parseInt(journalDaoImpt.get(jourUser.getJourName()).getJourPrice());
            payments.add(new payment(num * jourPrice , jourUser.getJourName()));
        }
        return payments;


    }
}
