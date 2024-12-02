package org.example;

public class Motorcycle extends Vehicle {
    Integer engineCapacity;

    public Motorcycle(String brand, String model, Integer year, Integer engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "engineCapacity=" + engineCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
