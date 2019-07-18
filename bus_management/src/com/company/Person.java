package com.company;

public class Person {
    private String name, personId;
    private Trip trip;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Person(String name, String personId) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        if(trip == null) {
            return "name: "+name+"personId = "+personId;
        }
        return "name: "+name+"personId = "+personId
                +"trip"+trip.toString();
    }
}
