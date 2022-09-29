package com.company.lab4;

import java.util.List;

public class Lab4 {
    public static void main(String[] args) {
        Road road = new Road();
        road.savePassengerToFile(new Person("Ihor", "Klimov", "wefn23Fn23"));

        List<Person> passengers = road.readPassengersFromFile();
        System.out.println("Found " + passengers.size() + " from file");
        for (Person passenger : passengers) {
            System.out.println(passenger.toString());
        }
    }
}
