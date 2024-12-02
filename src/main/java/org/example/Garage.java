package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class Garage {
    ArrayList <Vehicle> vehicleArrayList;

    public Garage() {
        vehicleArrayList = new ArrayList<>();
    }

    public void addVehicle(Vehicle newVehicle){
        vehicleArrayList.add(newVehicle);
    }

    public void removeVehicle (String model){
        vehicleArrayList.removeIf(vehicle -> vehicle.model==model);
    }

    public void printListVehicles (){
        vehicleArrayList.sort(Comparator.comparing(vehicle -> vehicle.brand));
        vehicleArrayList.forEach(vehicle -> System.out.println(vehicle));
    }
}
