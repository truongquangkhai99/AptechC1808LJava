package com.company.main;

import java.security.PublicKey;

public class Product extends  Object{
    {
        //initialization block
        System.out.println("1.Initialization block");
    }
    //private thuoc tinh + public getter/setter = encapsulation = tinh dong goi
    private Integer productId = 0;// Eager <> lazy
    private String productName = "";
    private Integer year = 0;
    //constructor
    Product() {
        //default(no-params) constructor
        System.out.println("2.Default constructor");

    }
    //custom constructor
    public Product(Integer productId, String productName, Integer year) {
        this.productId = productId;
        this.productName = productName;
        this.year = year;
    }

    //getter
    public Integer getProductId() {
        return productId;
    }


    public String getProductName() {
        //ko co getter => hidden
        //thuoc tinh co getter+setter = read-write
        //thuoc tinh co getter, ko co setter = read-only. VD: productId
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "productId: "+productId
                +"name = "+productName+"";
    }

    //destructor / deinit
}
