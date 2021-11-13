package com.example.journalMS.domain;

public class jourUser {
    private String jourName;
    private String userName;
    private int num;

    public jourUser() {
    }

    public jourUser(String jourName, String userName, int num) {
        this.jourName = jourName;
        this.userName = userName;
        this.num = num;
    }

    public String getJourName() {
        return jourName;
    }

    public void setJourName(String jourName) {
        this.jourName = jourName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "jourUser{" +
                "jourName='" + jourName + '\'' +
                ", userName='" + userName + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
