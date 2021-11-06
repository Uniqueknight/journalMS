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


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
}
