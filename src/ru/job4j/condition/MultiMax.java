package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first >= second ? first : second;
        result = result >= third ? result : third;
        return result;
    }

    public static void main(String[] args) {
        int result = MultiMax.max(5, 9, 4);
        System.out.println(result);

        result = MultiMax.max(4, 1, 4);
        System.out.println(result);
    }
}
