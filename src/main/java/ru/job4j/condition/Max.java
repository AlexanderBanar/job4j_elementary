package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int up) {
        return max(left, max(right, up));
    }

    public static int max(int left, int right, int up, int down) {
        return max(left, max(right, up, down));
    }

    public static void main(String[] args) {
        int result = Max.max(2, 3);
        System.out.println(result);
        result = Max.max(4, 1);
        System.out.println(result);
        result = Max.max(5, 5);
        System.out.println(result);
    }
}
