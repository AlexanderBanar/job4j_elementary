package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        String driving = "On parking";
        if (passengers(4) == 0) {
            driving = "On drive ...";
        }
        return driving;
    }

    @Override
    public int passengers(int quantityOfPassengers) {
        int forDrive = -1;
        if (quantityOfPassengers > 0) {
            forDrive = 0;
        }
        return forDrive;
    }

    @Override
    public double fuel(double volumeOfFuel) {
        double price = 0.00;
        double cost = 0.00;
        if (drive().equals("On driving ...")) {
            cost = price * volumeOfFuel;
        }
        return cost;
    }
}
