package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean exist = (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
        return exist;
    }

    public static void main(String[] args) {
        boolean exist = Triangle.exist(1.0, 2.0, 3.0);
        System.out.println(exist);
        exist = Triangle.exist(7.0, 15.0, 9.0);
        System.out.println(exist);
    }
}
