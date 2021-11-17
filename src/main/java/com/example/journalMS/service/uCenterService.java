package com.example.journalMS.service;

import com.example.journalMS.domain.journal;
import com.example.journalMS.domain.payment;
import com.example.journalMS.domain.userInfo;

import java.util.List;

public interface uCenterService {

    //往jouruser中添加user
    public void addJournal(String jourName,String userName);

    //从jouruser中删除user
    public void deleteJournal(String jourName,String userName);

    //获得(当前)用户的userInfo
    public userInfo getUserInfo(String userName);


    //数据来源是表单，要如何去操作才能将原先的userName导入呢？
    //过于麻烦，不开放userName的修改
    //修改userName会导致一系列同步的问题，比如session的值该如何？对吧。
    //必须保证userName的不变
    //将userInfo填入数据库中，同时更新user表
    public void changeUserInfo(userInfo uInfo);

    //获得当前用户所订阅的信息
    public List<journal> getUserJournal(String userName);

    //计算当前用户特定书籍的金额
    //需要XX来得到两张表（userName && jourName）
    //jourName是变化的，userName是固定的，传个List<jourName>???
    //价格本质上是Num x price ，难点在于获取两张表中的数据，还要按顺序返回，咋搞？
    public  List<payment> getPayment(String userName);


















}
