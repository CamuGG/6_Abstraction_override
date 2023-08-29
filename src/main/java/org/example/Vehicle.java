package org.example;

public abstract class Vehicle {
    private String type;
    private int numbersOfWheels;

    public Vehicle(String type, int numbersOfWheels) {
        this.type = type;
        this.numbersOfWheels = numbersOfWheels;
    }

    public void showVehicleDetails(){
        System.out.println("Vehicle type: " + type + "\n" +"number of wheels : " + numbersOfWheels);
    }

    public abstract  String doVehicleSound();
}
