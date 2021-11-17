package com.example.journalMS.domain;

public class payment {
    private int sumPrice;
    private String jourName;

    public payment() {

    }

    public payment(int sumPrice, String jourName) {
        this.sumPrice = sumPrice;
        this.jourName = jourName;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getJourName() {
        return jourName;
    }

    public void setJourName(String jourName) {
        this.jourName = jourName;
    }

    @Override
    public String toString() {
        return "payment{" +
                "sumPrice=" + sumPrice +
                ", jourName='" + jourName + '\'' +
                '}';
    }
}
