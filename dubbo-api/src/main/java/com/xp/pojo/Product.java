package com.xp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
    private Integer id;

    private String pname;

    private BigDecimal price;

    private String unit;

    private String pdate;

    private BigDecimal rate;

    private Integer type;

    public Product(Integer id, String pname, BigDecimal price, String unit, String pdate, BigDecimal rate, Integer type) {
        this.id = id;
        this.pname = pname;
        this.price = price;
        this.unit = unit;
        this.pdate = pdate;
        this.rate = rate;
        this.type = type;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPdate() {
        return pdate;
    }

    public void setPdate(String pdate) {
        this.pdate = pdate;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}