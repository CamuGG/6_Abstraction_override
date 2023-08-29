package org.example;

public class Boat extends Vehicle{

    private double maxKnotsSpeed;
    private int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        super("Boat",0);
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
    }

    @Override
    public String doVehicleSound() {
        return "splash";
    }

    public String getBoatWeightAndSpeed(){
        return "Boat's total kilos weigth: " + boatKilosWeight + " and maximum knots speed: " + maxKnotsSpeed;
    }
}
