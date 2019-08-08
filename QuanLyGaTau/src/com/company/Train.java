package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Train {
    //Đoàn tàu
    private String id;
    private String destination;
    private Date startTime;
    private Date endTime;
    //Relation
    private ArrayList<Carriage> carriages = new ArrayList<Carriage>();
    //"1", "Hai Phong",
    public Train(String id, String destination, Date startTime,
                 Date endTime, ArrayList<Carriage> carriages) {
        this.id = id;
        this.destination = destination;
        this.startTime = startTime;
        this.endTime = endTime;
        this.carriages = carriages;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ArrayList<Carriage> getCarriages() {
        return carriages;
    }

    public void setCarriages(ArrayList<Carriage> carriages) {
        this.carriages = carriages;
    }
}
