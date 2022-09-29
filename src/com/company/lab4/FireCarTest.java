package com.company.lab4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireCarTest {
    private FireCar fireCar;

    @Before
    public void setUp() {
        fireCar = new FireCar(6);
    }

    @Test
    public void addPassengers_passengersAdded() {
        assertEquals(fireCar.getSeatsTaken(), 0);
        fireCar.addPassenger(new FireFighter("Steve3", "Martin3", "x23w23"));
        assertEquals(fireCar.getSeatsTaken(), 1);
    }

    @Test
    public void removePassengers_passengersRemoved() {
        FireFighter passenger1 = new FireFighter("Steve", "Martin", "w23n23");
        FireFighter passenger2 = new FireFighter("Steve2", "Martin2", "w23w23");

        fireCar.addPassenger(passenger1);
        fireCar.addPassenger(passenger2);

        fireCar.removePassenger(passenger1);
        assertEquals(fireCar.getSeatsTaken(), 1);
        fireCar.removePassenger(passenger2);
        assertEquals(fireCar.getSeatsTaken(), 0);
    }
}
