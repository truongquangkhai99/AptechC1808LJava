package com.company;

public class Passenger {
    public static final Double AVERAGE_WEIGHT = 75.0;
    public static final Double LUGGAGE_WEIGHT = 25.0;
    private String name;
    private String citizenId;
    private Carriage carriage;

    public Passenger(String name, String citizenId, Carriage carriage) {
        this.name = name;
        this.citizenId = citizenId;
        this.carriage = carriage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public Carriage getCarriage() {
        return carriage;
    }

    public void setCarriage(Carriage carriage) {
        this.carriage = carriage;
    }
}
