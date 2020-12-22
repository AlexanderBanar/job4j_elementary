package ru.job4j.tasks2;

public class Initials {
    public static String convert(String[] fio) {
        String surname = fio[0] + " ";
        String a = fio[1].charAt(0) + ".";
        String b = fio[2].charAt(0) + ".";
        return surname + a + b;
    }
}
