package ru.job4j.tasks2;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        int size = places.length;
        Place[][] temp = new Place[size][size];
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places.length; j++) {
                if (places[i][j] == null && (i + j) % 2 == 0) {
                    temp[i][j] = new Place(i, j);
                }
            }
        }
        int rslRow = size;
        int rslCell = size;
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (temp[i][j] != null && (i + j) < (rslRow + rslCell)) {
                    rslRow = i;
                    rslCell = j;
                }
            }
        }
        return (rslRow + rslCell == size * 2) ? null : new Place(rslRow, rslCell);
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row &&
                    cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}
