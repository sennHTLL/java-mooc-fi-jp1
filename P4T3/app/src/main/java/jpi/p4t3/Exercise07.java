package jpi.p4t3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructor.Person;

public class Exercise07 {
    public static void run() {
        IO.println("=== Exercise 7 ===");
        IO.println("[files] · storing records");

        Scanner scanner = new Scanner(System.in);    

        ArrayList<Person> records = readRecordsFromFile();
        IO.println("Persons (total count): " + records.size());
        IO.println("Persons:");
        for (Person person : records) { IO.println(person); }
    }

    public static ArrayList<Person> readRecordsFromFile() {
        ArrayList<Person> persons = new ArrayList<>();
        String path = "app/src/main/resources/files/csv-f.txt";
        String[] parts;
        String name;
        int age;

        try (Scanner reader = new Scanner(Paths.get(path))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                parts = line.split(",");

                name = parts[0];
                age = Integer.valueOf(parts[1]);

                persons.add(new Person(name, age));
            }
        } catch (Exception e) { IO.println("3RR0R: " + e.getMessage()); }

        return persons;
    }
}
