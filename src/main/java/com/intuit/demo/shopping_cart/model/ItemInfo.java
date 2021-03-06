package com.intuit.demo.shopping_cart.model;

import com.intuit.demo.shopping_cart.entity.Item;

public class ItemInfo {
    private String code;
    private String name;
    private double price;

    public ItemInfo() {
    }

    public ItemInfo(Item item) {
        this.code = item.getCode();
        this.name = item.getName();
        this.price = item.getPrice();
    }

    // Using in JPA/Hibernate query
    public ItemInfo(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}