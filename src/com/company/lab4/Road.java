package com.company.lab4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Road {
    public List<Vehicle> carsInRoad = new ArrayList<>();

    public int getCountOfHumans() {
        int result = 0;

        for (Vehicle vehicle : carsInRoad) {
            result += vehicle.getSeatsTaken();
        }

        return result;
    }

    public void savePassengerToFile(Person person) {
        try {
            FileOutputStream fos = new FileOutputStream("people");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            List<Person> passengers = readPassengersFromFile();
            passengers.add(person);

            oos.writeObject(passengers);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> readPassengersFromFile() {
        try {
            FileInputStream fis = new FileInputStream("people");
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Person> passengers = (List<Person>) ois.readObject();
            ois.close();
            fis.close();
            return passengers;
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public void addCarToRoad(Vehicle vehicle) {
        carsInRoad.add(vehicle);
    }
}
