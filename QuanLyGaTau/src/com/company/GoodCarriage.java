package com.company;

import java.util.ArrayList;

public class GoodCarriage extends Carriage {
    private ArrayList<Good> goods = new ArrayList<Good>();
    public GoodCarriage(Double weight, Double extraWeight) {
        super(weight, extraWeight);
    }
    @Override
    public Double getExtraWeight() {
        Double sum = getWeight();
        for(Good good: goods) {
            sum += good.getWeight();
        }
        setExtraWeight(sum);
        return sum;
    }
}
