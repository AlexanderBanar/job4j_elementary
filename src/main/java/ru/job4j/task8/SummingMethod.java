package ru.job4j.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {
    public static class User {
        private String name;
        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }

        public String getName() {
            return name;
        }

        public List<Bill> getBills() {
            return bills;
        }
    }

    public static class Bill {
        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {
        List<Pair> pairs = new ArrayList<>();
        for (User n : users) {
            for (Bill k : n.getBills()) {
                Pair temp = new Pair(n, k);
                pairs.add(temp);
            }
        }
        Map<String, Integer> rsl = pairs.stream()
                .collect(Collectors.groupingBy(
                        x -> x.getUser().getName(),
                        Collectors.summingInt(x -> x.getBill().getBalance())
                ));
        return rsl;
    }
}
