package org.example;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Vehicle vehicle1 = new Car("Peugeot", "308",  2016, 5);
        Vehicle vehicle2 = new Car("BMW","5Series",2020, 5);
        Vehicle vehicle3 = new Motorcycle("Hoinar","Basic",1986,750);
        Vehicle vehicle4 = new Motorcycle("Mobra","Lux",1957,60);
        garage.addVehicle(vehicle1);
        garage.addVehicle(vehicle2);
        garage.addVehicle(vehicle3);
        garage.addVehicle(vehicle4);
        System.out.println("-------------------------------------------");
        garage.printListVehicles();
        System.out.println("-------------------------------------------");
        garage.removeVehicle("5Series");
        System.out.println("-------------------------------------------");
        garage.printListVehicles();
    }

}
