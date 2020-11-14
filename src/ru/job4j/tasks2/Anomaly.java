package ru.job4j.tasks2;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                counter++;
            }
        }
        if (counter == 0) {
            return new int[0][0];
        } else {
            counter = 0;
            String status = "initial";
            for (int i = 0; i < data.length; i++) {
                if ((data[i] <= down || data[i] >= up) && status.equals("initial")) {
                    status = "started";
                }
                if ((data[i] > down || data[i] < up) && status.equals("started")) {
                    status = "initial";
                    counter++;
                }
            }
            int[][] rsl = new int[counter][];
            status = "initial";
            int startIndex = 0;
            int rslIndex = 0;
            boolean upOn = false;
            boolean downOn = false;
            for (int i = 0; i < data.length; i++) {
                if (upOn || downOn) {

                } else {
                    if (data[i] >= up) {
                        upOn = true;
                        startIndex = i;
                    }
                    if (data[i] <= down) {
                        downOn = true;
                        startIndex = i;
                    }
                }






                if ((data[i] <= down || data[i] >= up) && status.equals("initial")) {
                    status = "started";
                    startIndex = i;
                }
                if ((data[i] > down || data[i] < up) && status.equals("started")) {
                    status = "initial";
                    if (i - startIndex != 1 && rslIndex < rsl.length) {
                        rsl[rslIndex++] = Arrays.copyOfRange(data, startIndex, i);
                    } else {
                        rsl[rslIndex++] = new int[] {data[i - 1], data[i - 1]};
                    }





                }
            }
            return rsl;
        }
    }
}
