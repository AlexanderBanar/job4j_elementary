package ru.job4j.tasks5;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        List<Info> rsl = new ArrayList<>();
        Map<String, Integer> temp = new HashMap();
        int box = 0;
        for (Info n : list) {
            if (temp.containsKey(n.getCity())) {
                box = temp.get(n.getCity()) + n.getRainfall();
                temp.put(n.getCity(), box);
            } else {
                temp.put(n.getCity(), n.getRainfall());
            }
        }
        Iterator<Map.Entry<String, Integer>> it = temp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> pair = it.next();
            rsl.add(new Info(pair.getKey(), pair.getValue()));
        }
        return rsl;
    }

    public static class Info {
        private String city;

        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall &&
                    Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}
