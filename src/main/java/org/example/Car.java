package org.example;

public class Car extends Vehicle{
    Integer seats;

    public Car(String brand, String model, Integer year, Integer seats) {
        super(brand, model, year);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
