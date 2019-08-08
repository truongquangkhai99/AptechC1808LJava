package com.company;

import java.util.ArrayList;

public class Carriage {
    private Double weight;//ko tai
    private Double extraWeight;//co them hanh khach, hang hoa

    public Carriage(Double weight, Double extraWeight) {
        this.weight = weight;
        this.extraWeight = extraWeight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getExtraWeight() {
        return extraWeight;
    }

    public void setExtraWeight(Double extraWeight) {
        this.extraWeight = extraWeight;
    }
}
