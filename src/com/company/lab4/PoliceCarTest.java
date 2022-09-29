package com.company.lab4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PoliceCarTest {
    private PoliceCar policecar;

    @Before
    public void setUp() {
        policecar = new PoliceCar(2);
    }

    @Test
    public void addPassengers_passengersAdded() {
        assertEquals(policecar.getSeatsTaken(), 0);
        policecar.addPassenger(new Policeman("Steve3", "Martin3", "x23w23"));
        assertEquals(policecar.getSeatsTaken(), 1);
    }

    @Test
    public void removePassengers_passengersRemoved() {
        Policeman passenger1 = new Policeman("Steve", "Martin", "w23n23");
        Policeman passenger2 = new Policeman("Steve2", "Martin2", "w23w23");

        policecar.addPassenger(passenger1);
        policecar.addPassenger(passenger2);

        policecar.removePassenger(passenger1);
        assertEquals(policecar.getSeatsTaken(), 1);
        policecar.removePassenger(passenger2);
        assertEquals(policecar.getSeatsTaken(), 0);
    }
}
