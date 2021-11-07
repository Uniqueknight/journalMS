package com.example.journalMS.domain;

public class journal {
    private String jourName;
    private String jourNum;
    private String jourType;
    private String jourPrice;
    private String jourYear;
    private String jourPart;

    public journal() {
    }

    public journal(String jourName, String jourNum, String jourType, String jourPrice, String jourYear, String jourPart) {
        this.jourName = jourName;
        this.jourNum = jourNum;
        this.jourType = jourType;
        this.jourPrice = jourPrice;
        this.jourYear = jourYear;
        this.jourPart = jourPart;
    }

    public String getJourName() {
        return jourName;
    }

    public void setJourName(String jourName) {
        this.jourName = jourName;
    }

    public String getJourNum() {
        return jourNum;
    }

    public void setJourNum(String jourNum) {
        this.jourNum = jourNum;
    }

    public String getJourType() {
        return jourType;
    }

    public void setJourType(String jourType) {
        this.jourType = jourType;
    }

    public String getJourPrice() {
        return jourPrice;
    }

    public void setJourPrice(String jourPrice) {
        this.jourPrice = jourPrice;
    }

    public String getJourYear() {
        return jourYear;
    }

    public void setJourYear(String jourYear) {
        this.jourYear = jourYear;
    }

    public String getJourPart() {
        return jourPart;
    }

    public void setJourPart(String jourPart) {
        this.jourPart = jourPart;
    }

    @Override
    public String toString() {
        return "journal{" +
                "jourName='" + jourName + '\'' +
                ", jourNum='" + jourNum + '\'' +
                ", jourType='" + jourType + '\'' +
                ", jourPrice='" + jourPrice + '\'' +
                ", jourYear='" + jourYear + '\'' +
                ", jourPart='" + jourPart + '\'' +
                '}';
    }
}
