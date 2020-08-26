package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 100);
        Book second = new Book("Java for noobs", 200);
        Book third = new Book("Algorithms", 300);
        Book fourth = new Book("IT for beginners", 400);
        Book[] bunch = new Book[4];
        bunch[0] = first;
        bunch[1] = second;
        bunch[2] = third;
        bunch[3] = fourth;
        System.out.println("First step");
        for (int index = 0; index < bunch.length; index++) {
            Book temp = bunch[index];
            System.out.println(temp.getName() + ": " + temp.getPageCount());
        }
        System.out.println();
        System.out.println("Second step");
        Book tmp = bunch[0];
        bunch[0] = bunch[3];
        bunch[3] = tmp;
        for (int index = 0; index < bunch.length; index++) {
            Book temp = bunch[index];
            System.out.println(temp.getName() + ": " + temp.getPageCount());
        }
        System.out.println();
        System.out.println("Third step");
        for (int index = 0; index < bunch.length; index++) {
            Book temp = bunch[index];
            if (temp.getName().equals("Clean code")) {
                System.out.println(temp.getName() + ": " + temp.getPageCount());
            }
        }
    }
}
