package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        String name = input.nextLine();
        int answer = new Random().nextInt(3);
        String reply;
        if (answer == 0) {
            reply = "Да";
        } else if (answer == 1) {
            reply = "Нет";
        } else {
            reply = "Может быть";
        }
        System.out.println(reply);
    }
}
