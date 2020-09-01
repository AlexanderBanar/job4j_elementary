package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
                System.out.println("======================");
                System.out.println();
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] listOfCurrentItems = tracker.findAll();
                for (int i = 0; i < listOfCurrentItems.length; i++) {
                    System.out.println(listOfCurrentItems[i]);
                }
                System.out.println("======================");
                System.out.println();
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print(" Enter item Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                System.out.print(" Enter item name: ");
                String nameForEdit = scanner.nextLine();
                Item itemForEdit = new Item();
                itemForEdit.setName(nameForEdit);
                if (tracker.replace(id, itemForEdit)) {
                    System.out.println("Item Id " + id + " has been edited successfully");
                } else {
                    System.out.println("Error! Id you have entered is not found. Please try again with other Id");
                }
                System.out.println("======================");
                System.out.println();
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print(" Enter item Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Item Id " + id + " has been deleted successfully");
                } else {
                    System.out.println("Error! Id you have entered is not found. Please try again with other Id");
                }
                System.out.println("======================");
                System.out.println();
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.print(" Enter item Id: ");
                int id = Integer.valueOf(scanner.nextLine());
                Item itemOfIdFind = tracker.findById(id);
                if (itemOfIdFind != null) {
                    System.out.println(itemOfIdFind.getName());
                } else {
                    System.out.println("Error! Id you have entered is not found. Please try again with other Id");
                }
                System.out.println("======================");
                System.out.println();
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print(" Enter item name: ");
                String nameOfFind = scanner.nextLine();
                Item[] itemsOfNameFind = tracker.findByName(nameOfFind);
                if (itemsOfNameFind.length > 0) {
                    for (int i = 0; i < itemsOfNameFind.length; i++) {
                        System.out.println(itemsOfNameFind[i]);
                    }
                } else {
                    System.out.println("Error! Items with the name you have entered is not found.");
                    System.out.println("Please try again with other Id");
                }
                System.out.println("======================");
                System.out.println();
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
