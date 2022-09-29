package com.company.lab4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaxiTest {
    private Taxi taxi;

    @Before
    public void setUp() {
        taxi = new Taxi(4);
    }

    @Test
    public void addPassengersToTaxi_passengersAdded() {
        assertEquals(taxi.getSeatsTaken(), 0);
        taxi.addPassenger(new Person("Steve", "Martin", "w23n23"));
        assertEquals(taxi.getSeatsTaken(), 1);
        taxi.addPassenger(new FireFighter("Steve2", "Martin2", "w23w23"));
        assertEquals(taxi.getSeatsTaken(), 2);
        taxi.addPassenger(new Policeman("Steve3", "Martin3", "x23w23"));
        assertEquals(taxi.getSeatsTaken(), 3);
    }

    @Test
    public void removePassengersToTaxi_passengersRemoved() {
        Person passenger1 = new Person("Steve", "Martin", "w23n23");
        FireFighter passenger2 = new FireFighter("Steve2", "Martin2", "w23w23");
        Policeman passenger3 = new Policeman("Steve3", "Martin3", "x23w23");

        taxi.addPassenger(passenger1);
        taxi.addPassenger(passenger2);
        taxi.addPassenger(passenger3);

        taxi.removePassenger(passenger1);
        assertEquals(taxi.getSeatsTaken(), 2);
        taxi.removePassenger(passenger2);
        assertEquals(taxi.getSeatsTaken(), 1);
        taxi.removePassenger(passenger3);
        assertEquals(taxi.getSeatsTaken(), 0);
    }
}
