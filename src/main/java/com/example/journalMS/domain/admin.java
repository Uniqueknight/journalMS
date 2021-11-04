package com.example.journalMS.domain;



public class admin extends Ahuman {

    private String type;
    private String useName;
    private String passWord;
    private String lastLogin;

    public admin(){
        this.type = "admin";
    }

    public admin(String usename, String password, String lastLogin) {
        this.type = "admin";
        this.useName = usename;
        this.passWord = password;
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "admin{" +
                "usename='" + useName + '\'' +
                ", password='" + passWord + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                '}';
    }

    public String getUsename() {
        return useName;
    }

    public void setUsename(String usename) {
        this.useName = usename;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
}
