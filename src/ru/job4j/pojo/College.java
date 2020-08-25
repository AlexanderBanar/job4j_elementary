package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student alex = new Student();
        alex.setfIO("Banar Alexander Rinatovich");
        alex.setGroup(777);
        alex.setDateOfEnter(new Date());
        System.out.println(alex.getfIO() + ", group: " +
                alex.getGroup() + ", entered on: " +
                alex.getDateOfEnter());
    }
}
