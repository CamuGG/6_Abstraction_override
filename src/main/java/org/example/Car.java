package org.example;

public class Car extends Vehicle{

    private int numberOfDoors;

    private double carPrice;

    public Car(int numbersOfWheels, int numberOfDoors, double carPrice) {
        super("Car", numbersOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("number of doors: " + numberOfDoors);
    }

    @Override
    public String doVehicleSound() {
        return "brum brum";
    }
}
