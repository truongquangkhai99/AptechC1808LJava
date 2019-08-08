package com.company;

public class Good {
    private String name;
    private Double weight;
    private GoodCarriage goodCarriage;

    public Good(String name, Double weight, GoodCarriage goodCarriage) {
        this.name = name;
        this.weight = weight;
        this.goodCarriage = goodCarriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public GoodCarriage getGoodCarriage() {
        return goodCarriage;
    }

    public void setGoodCarriage(GoodCarriage goodCarriage) {
        this.goodCarriage = goodCarriage;
    }
}
