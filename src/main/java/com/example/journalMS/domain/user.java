package com.example.journalMS.domain;

public class user extends Ahuman{
    private String type;
    private String useName;
    private String passWord;
    private String loginTime;

    public user(){

    }

    public user(String useName, String passWord, String loginTime) {
        this.type = "user";
        this.useName = useName;
        this.passWord = passWord;
        this.loginTime = loginTime;
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "user{" +
                "useName='" + useName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", loginTime='" + loginTime + '\'' +
                '}';
    }
}
