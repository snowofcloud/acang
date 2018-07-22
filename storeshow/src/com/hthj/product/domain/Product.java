package com.hthj.product.domain;

import java.util.Date;

/**
 * @author: xuxueqiang
 * @date: 2018/7/17 15:46
 */
public class Product {
    private int pid;
    private String name;
    private int price;
    private Date pdate;

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }



}
