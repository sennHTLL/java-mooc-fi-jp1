package jpi.p7;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import jpi.constructor.Bird;

public class Exercise06 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        Random random = new Random();

        IO.println("===== COMMANDS =====");
        IO.println("add - adds a bird");
        IO.println("observation - add observation");
        IO.println("list - print all birds");
        IO.println("one - print one bird");
        IO.println("quit - quit the program");

        IO.println("===== TAZ'DINGO =====");
        while (true) {
            IO.print("? ");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                add(birds, scanner);
            }

            if (command.equals("observation")) {
                observation(birds, scanner);
            }

            if (command.equals("list")) {
                for (Bird bird : birds) {
                    IO.println(bird);
                }
            }

            if (command.equals("one")) {
                int i = random.nextInt(birds.size());
                IO.println(birds.get(i));
            }
        }

        for (Bird bird : birds) {
            IO.println(bird);
        }

        scanner.close();
    }

    public static void observation(ArrayList<Bird> birds, Scanner scanner) {
        IO.print("Bird: ");
        String observate = scanner.nextLine();

        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(observate) || birds.get(i).getNihon().equals(observate)) {
                birds.get(i).updCount();
            }
        }
    }

    public static void add(ArrayList<Bird> birds, Scanner scanner) {
        IO.print("Name: ");
        String name = scanner.nextLine();
        IO.print("Nihon name: ");
        String nihon = scanner.nextLine();

        birds.add(new Bird(name, nihon));
    }
}
