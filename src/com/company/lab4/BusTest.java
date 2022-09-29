package com.company.lab4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;

    @Before
    public void setUp() {
        bus = new Bus(40);
    }

    @Test
    public void addPassengers_passengersAdded() {
        assertEquals(bus.getSeatsTaken(), 0);
        bus.addPassenger(new Person("Steve", "Martin", "w23n23"));
        assertEquals(bus.getSeatsTaken(), 1);
        bus.addPassenger(new FireFighter("Steve2", "Martin2", "w23w23"));
        assertEquals(bus.getSeatsTaken(), 2);
        bus.addPassenger(new Policeman("Steve3", "Martin3", "x23w23"));
        assertEquals(bus.getSeatsTaken(), 3);
    }

    @Test
    public void removePassengers_passengersRemoved() {
        Person passenger1 = new Person("Steve", "Martin", "w23n23");
        FireFighter passenger2 = new FireFighter("Steve2", "Martin2", "w23w23");
        Policeman passenger3 = new Policeman("Steve3", "Martin3", "x23w23");

        bus.addPassenger(passenger1);
        bus.addPassenger(passenger2);
        bus.addPassenger(passenger3);

        bus.removePassenger(passenger1);
        assertEquals(bus.getSeatsTaken(), 2);
        bus.removePassenger(passenger2);
        assertEquals(bus.getSeatsTaken(), 1);
        bus.removePassenger(passenger3);
        assertEquals(bus.getSeatsTaken(), 0);
    }
}
