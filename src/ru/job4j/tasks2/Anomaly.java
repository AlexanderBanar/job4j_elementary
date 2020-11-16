package ru.job4j.tasks2;

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
            boolean isAnomaly = false;
            counter = 0;
            for (int i = 0; i < data.length; i++) {
                if (isAnomaly) {
                    if (data[i] < up || data[i] > down) {
                        counter++;
                        isAnomaly = false;
                    }
                } else {
                    if (data[i] >= up || data[i] <= down) {
                        isAnomaly = true;
                    }
                }
                if (i == data.length - 1 && isAnomaly) {
                    counter++;
                }
            }
            int[][] rsl = new int[counter][];
            int startIndex = 0;
            int rslIndex = 0;
            if (isAnomaly) {
                isAnomaly = false;
            }
            for (int i = 0; i < data.length; i++) {
                if (isAnomaly) {
                    if (data[i] < up && data[i] > down) {
                        if (i - 1 - startIndex > 0 && rslIndex < rsl.length) {
                            rsl[rslIndex++] = new int[] {startIndex, i - 1};
                        } else {
                            if (rslIndex < rsl.length) {
                                rsl[rslIndex++] = new int[] {i - 1, i - 1};
                            }
                        }
                        isAnomaly = false;
                    }
                } else {
                    if (data[i] >= up || data[i] <= down) {
                        startIndex = i;
                        isAnomaly = true;
                    }
                }
                if (i == data.length - 1 && isAnomaly) {
                    if (i - startIndex > 0 && rslIndex < rsl.length) {
                        rsl[rslIndex++] = new int[] {startIndex, i};
                    } else {
                        if (rslIndex < rsl.length) {
                            rsl[rslIndex++] = new int[] {i, i};
                        }
                    }
                }
            }
            return rsl;
        }
    }
}
