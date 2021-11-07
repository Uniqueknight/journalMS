package com.example.journalMS.domain;

public class userInfo {
    private String userName;
    private String passWord;
    private String sex;
    private String email;
    private String phone;
    private String city;
    private String age;

    public userInfo(String userName, String passWord, String sex, String email, String phone, String city, String age) {
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "userINFO{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
