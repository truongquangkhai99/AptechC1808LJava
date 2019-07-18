package com.company;

import java.util.ArrayList;

public class Bus {
    private Integer busId, numberOfSeats;
    private String name;
    public static final Integer MAX_TRIPS = 30;
    //relation
    private ArrayList<Trip> trips = new ArrayList<>();//aggregation

    public Bus(Integer busId, Integer numberOfSeats, String name) {
        this.busId = busId;
        this.numberOfSeats = numberOfSeats;
        this.name = name;
    }

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }

    @Override
    public String toString() {
        return "busId:"+busId+",number of Seats : "+numberOfSeats+",name :"+name;
    }
}
