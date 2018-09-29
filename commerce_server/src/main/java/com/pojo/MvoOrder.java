package com.pojo;

import java.util.Date;

public class MvoOrder {
    private Integer id;

    private String title;

    private Double price;

    private Date createDate;

    private String number;

    private Integer uId;

    public MvoOrder(Integer id, String title, Double price, Date createDate, String number, Integer uId) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.createDate = createDate;
        this.number = number;
        this.uId = uId;
    }

    public MvoOrder() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }
}