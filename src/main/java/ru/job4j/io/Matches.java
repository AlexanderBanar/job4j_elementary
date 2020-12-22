package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("На столе 11 спичек. Выигрывает тот, кто забрал последние спички.");
        System.out.println("Вы можете вытянуть за раз от 1 до 3 спичек.");
        int quantity = 11;
        int gamerA = 0;
        int gamerB = 0;
        while (quantity > 0) {
            if (gamerA <= gamerB) {
                System.out.println("Игрок А, введите число от 1 до 3");
                gamerA++;
            } else if (gamerA > gamerB) {
                System.out.println("Игрок Б, введите число от 1 до 3");
                gamerB++;
            }
            int select = Integer.valueOf(input.nextLine());
            quantity -= select;
            if (quantity > 0) {
                System.out.println("На столе остается спичек: " + quantity);
            }
        }
        System.out.println("Все спички кончились!");
        String winner = (gamerA > gamerB) ? "Победил Игрок А!" : "Победил Игрок Б!";
        System.out.println(winner);
    }
}
