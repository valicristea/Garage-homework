package org.example;

abstract class Vehicle {
    String brand;
    String model;
    Integer year;

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}
