package com.company;

import java.util.ArrayList;

public class PassengerCarriage extends Carriage{
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();
    public PassengerCarriage(Double weight, Double extraWeight) {
        super(weight, extraWeight);
    }

    @Override
    public Double getExtraWeight() {
        Double sum = getWeight() + passengers.size()*
                (Passenger.AVERAGE_WEIGHT + Passenger.LUGGAGE_WEIGHT);
        setExtraWeight(sum);
        return sum;
    }
    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        this.getExtraWeight();
    }
    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
        this.getExtraWeight();
    }
}
