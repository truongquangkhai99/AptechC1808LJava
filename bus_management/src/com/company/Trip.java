package com.company;

import java.util.Date;

public class Trip {
    private Integer tripId;
    private Bus bus;
    private Date startTime;
    public static final Integer MAX_PERSONS = 80;

    public Trip(Integer tripId, Bus bus, Date startTime) {
        this.tripId = tripId;
        this.bus = bus;
        this.startTime = startTime;
    }

    public Integer getTripId() {
        return tripId;
    }

    public void setTripId(Integer tripId) {
        this.tripId = tripId;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
