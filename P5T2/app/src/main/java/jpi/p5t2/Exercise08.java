package jpi.p5t2;

import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructor.Archive;

public class Exercise08 {
    public static void run() {
        IO.println("=== [xercise] · 8 ===");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Archive> items = new ArrayList<>();

        while (true) {
            IO.println("Identifier? (empty will stop)");
            String usId = scanner.nextLine();
            if (usId.equals("")) { break; }

            IO.println("Name? (empty will stop)");
            String usName = scanner.nextLine();
            if (usName.equals("")) { break; }

            Archive item = new Archive(usId, usName);

            if (items.contains(item)) { continue; }
            else { items.add(item); }
        }

        IO.println("==== Items ====");
        for (Archive item : items) {
            IO.println(item);
        }
    }
}
