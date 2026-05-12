package jpi.p4t2;

import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructors.Items;

public class Exercise02 {

    public static void run() {
        IO.println("=== EXERCISE 2 ===");
        IO.println("[oop] · objects in list");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();

        while (true) {
            IO.print("Enter a name of item (empty to stop): ");
            String itemName = scanner.nextLine();
            if (itemName.isEmpty()) break;
            items.add(new Items(itemName));
        }

        for (Items item : items) {
            IO.println(item);
        }
    }
}
