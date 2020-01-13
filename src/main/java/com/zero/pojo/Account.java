package com.zero.pojo;

import java.io.Serializable;
import java.util.Date;

public class Account implements Serializable {
    private Integer id;
    private String name;
    private String dept;
    private Double money;
    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Account() {
    }

    public Account(Integer id, String name, String dept, Double money, Date createDate) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.money = money;
        this.createDate = createDate;
    }
}
