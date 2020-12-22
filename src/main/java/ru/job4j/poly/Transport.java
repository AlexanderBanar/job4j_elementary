package ru.job4j.poly;

public interface Transport {
    String drive();

    int passengers(int quantityOfPassengers);

    double fuel(double volumeOfFuel);
}
