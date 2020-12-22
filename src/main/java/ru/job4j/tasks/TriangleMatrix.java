package ru.job4j.tasks;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int j = 0;
        int t = 1;
        for (int i = 0; i < count; i++) {
            j++;
            int[] temp = new int[j];
            for (int k = 0; k < temp.length; k++) {
                temp[k] = t++;
            }
            triangle[i] = temp;
        }
        return triangle;
    }
}
