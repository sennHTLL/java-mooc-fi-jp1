package jpi.p4t2;

import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructors.PersonalInfoCollection;

public class Exercise03 {

    public static void run() {
        IO.println("=== EXERCISE 3 ===");
        IO.println("[oop] · objects in list");

        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInfoCollection> PIC = new ArrayList<>();

        while (true) {
            IO.print("Enter first name: ");
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) break;

            IO.print("Enter last name: ");
            String lastName = scanner.nextLine();

            IO.print("Enter ID number: ");
            int idNum = Integer.valueOf(scanner.nextLine());

            PIC.add(new PersonalInfoCollection(firstName, lastName, idNum));
        }

        for (PersonalInfoCollection pic : PIC) {
            IO.println(pic);
        }
    }
}
