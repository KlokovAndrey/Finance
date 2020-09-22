package com.project.Finance.Entity.Send;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "kirill")
public class Entry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private double sum; //summary
    @Column
    private String category;
    @Column
    private Date date;
    @Column
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Entry(double sum, String category, Date date, String comment) {
        this.sum = sum;
        this.category = category;
        this.date = date;
        this.comment = comment;
    }

    public Entry() {
    }

    public Entry(double sum, String category, Date date) {
        this.sum = sum;
        this.category = category;
        this.date = date;
        this.comment = "";
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getSum() {
        return sum;
    }

    public String getCategory() {
        return category;
    }

    public Date getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }
}




