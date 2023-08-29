package org.example;

public class VehicleTester {
    public static void main(String[] args) {

        Car car = new Car(4, 5, 15000);

        Boat boat = new Boat(50, 2000);

        car.showVehicleDetails();
        car.doVehicleSound();

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println(boat.getBoatWeightAndSpeed());
    }

}
