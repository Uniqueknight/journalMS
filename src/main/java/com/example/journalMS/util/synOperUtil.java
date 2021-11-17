package com.example.journalMS.util;

import com.example.journalMS.dao.impl.loginUserImpt;
import com.example.journalMS.dao.impl.userInfoDaoImpt;
import com.example.journalMS.domain.user;
import com.example.journalMS.domain.userInfo;

public class synOperUtil {

    public void synAddUser(String userName,String passWord){
        loginUserImpt userImpt = new loginUserImpt();
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        userImpt.save(new user(userName,passWord));
        userInfoDaoImpt.save(new userInfo(userName,passWord,"无","无","无","无","无"));
    }

    public void synChangeUser(String userName,String passWord,user usr){
        loginUserImpt userImpt = new loginUserImpt();
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        userImpt.update(userName,usr);
        userInfoDaoImpt.update(userName,new userInfo(userName,passWord,"无","无","无","无","无"));
    }

    public void synChangeUser(String userName,String passWord,userInfo uInfo){
        loginUserImpt userImpt = new loginUserImpt();
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        userImpt.update(userName,new user(userName,passWord));
        userInfoDaoImpt.update(userName,uInfo);
    }


    public void synDeleteUser(String userName){
        loginUserImpt userImpt = new loginUserImpt();
        userInfoDaoImpt userInfoDaoImpt = new userInfoDaoImpt();
        userImpt.delete(userName);
        userInfoDaoImpt.delete(userName);

    }

}
