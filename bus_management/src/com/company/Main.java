package com.company;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        try {
            Bus bus30 = new Bus(30,41,"Mai Dong - BX My Dinh");
            Bus bus31 = new Bus(31,43,"BAch Khoa - Dai hoc Mo");
            //Xuat phat

            Trip trip1 = new Trip(1, bus30, new Date());//trip1 xuat phat
            bus30.getTrips().add(trip1);
            //nghi 3s
            TimeUnit.SECONDS.sleep(3);
            Trip trip2 = new Trip(2, bus31, new Date());
            bus31.getTrips().add(trip2);
            //Hanh khach len xe
            TimeUnit.SECONDS.sleep(3);
            Passenger passengerHoang = new Passenger("Hoang", "A1234");
            Customer customerA = new Customer("Anonymous","");
            trip1.addPerson(passengerHoang);
            trip1.addPerson(customerA);
            System.out.println(passengerHoang.toString());
            System.out.println(customerA.toString());

            //Xuong xe
            trip1.removePerson(passengerHoang);
            //Len trip2
            trip2.addPerson(passengerHoang);
            //Chuyen trip
            System.out.println("ok");

        } catch (Exception e) {
            System.out.println("Error is :"+e.toString());
        } finally {

        }


    }
}
