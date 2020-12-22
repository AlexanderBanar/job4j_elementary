package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            double increment = amount * (percent / 100);
            double amount2 = (amount + increment) - salary;
            amount = (int) Math.ceil(amount2);
            year++;
        }
        return year;
    }
}
