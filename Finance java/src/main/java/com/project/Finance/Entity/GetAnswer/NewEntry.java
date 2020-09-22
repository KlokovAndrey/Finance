package com.project.Finance.Entity.GetAnswer;

import com.project.Finance.Entity.Send.Entry;

import java.util.Date;

public class NewEntry {
    private String login;
    private double sum;
    private String category;
    private String comment;

    public NewEntry() {
    }

    public NewEntry(String login, double sum, String category, String comment) {
        this.login = login;
        this.sum = sum;
        this.category = category;
        this.comment = comment;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "NewEntry{" +
                "login='" + login + '\'' +
                ", sum=" + sum +
                ", category='" + category + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public void convertToEntry(Entry entry){
        entry.setSum(this.sum);
        entry.setCategory(this.category);
        entry.setComment(this.comment);
        entry.setDate(new Date());
    }
}
