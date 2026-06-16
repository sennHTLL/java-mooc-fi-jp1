package jpi.p4t3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise08 {
    public static void run() {
        IO.println("=== Exercise 8 ===");
        IO.println("[files] · sport statistics");

        Scanner scanner = new Scanner(System.in);

        // ArrayList<String> matchInfo = readFromFile(); 

        readFromFile();
    }

    public static void statistics() {}

    public static void readFromFile() {
        ArrayList<String> info = new ArrayList<>();
        String path = "app/src/main/resources/files/sportData.csv";
        String[] parts;

        String homeTeam;
        String visitingTeam;
        int homeTeamPoints;
        int visitingTeamPoints;
        
        int match = 0;

        try (Scanner reader = new Scanner(Paths.get(path))) {
            while (reader.hasNextLine()) {
                match++;
                String line = reader.nextLine();
                parts = line.split(",");

                homeTeam = parts[0];
                visitingTeam = parts[1];
                homeTeamPoints = Integer.valueOf(parts[2]);
                visitingTeamPoints = Integer.valueOf(parts[3]);

                // info.add(new ArrayList<>(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));

                IO.println(match + ". Home Team: " + homeTeam + ", Points: " + homeTeamPoints);
                IO.println(match + ". Visiting Team: " + visitingTeam + ", Points: " + visitingTeamPoints);
            }
        } catch (Exception e) { IO.println("3RR0R" + e.getMessage()); }
    }
}
