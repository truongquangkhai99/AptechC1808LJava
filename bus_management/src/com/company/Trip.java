package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Trip {
    private Integer tripId;
    private Bus bus;//relation
    private Date startTime;
    private int numberOfSeats;
    public static final Integer MAX_PERSONS = 80;
    //relation
    private ArrayList<Person> persons = new ArrayList<>();

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public Trip(Integer tripId, Bus bus, Date startTime) {
        this.tripId = tripId;
        this.bus = bus;
        this.startTime = startTime;
        this.numberOfSeats = this.bus.getNumberOfSeats();
    }
    public void addPerson(Person person) {
        //Kiem tra xem co them duoc ko ?
        if(persons.size() + 1 > 1.5*numberOfSeats) {
            return;
        }
        persons.add(person);
        numberOfSeats--;
        person.setTrip(this);
    }
    public void removePerson(Person person) {
        persons.remove(person);
        numberOfSeats++;
        person.setTrip(null);
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

    @Override
    public String toString() {
        return "tripId: "+tripId+"Bus: "+bus.toString()+"startTime: "+startTime;
    }
}
