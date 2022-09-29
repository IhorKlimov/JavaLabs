package com.company.lab4;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle<T> {
    private List<T> passengers = new ArrayList<>();
    private int maxSeats;

    public Vehicle(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public void addPassenger(T passenger) {
        if (passengers.size() == maxSeats) {
            throw new RuntimeException("All seats already taken!");
        } else {
            passengers.add(passenger);
        }
    }

    public void removePassenger(T passenger) {
        if (!passengers.contains(passenger)) {
            throw new IllegalArgumentException("Given passenger is not present in a current vehicle");
        } else {
            passengers.remove(passenger);
        }
    }

    public List<T> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<T> passengers) {
        this.passengers = passengers;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getSeatsTaken() {
        return passengers.size();
    }
}
