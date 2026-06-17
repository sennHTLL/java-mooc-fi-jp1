package jpi.p4t3;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructor.SportStatistics;

public class Exercise08 {
    public static void run() {
        IO.println("=== Exercise 8 ===");
        IO.println("[files] · sport statistics");

        Scanner scanner = new Scanner(System.in);

        IO.println("All Matches .");
        allMatches();

        IO.println("Type team");
        String userTeamInput = scanner.nextLine();
        searchTeamInfo(userTeamInput);
    }

    public static void searchTeamInfo(String team) {
        ArrayList<SportStatistics> matchInfo = readFromFile();

        int matches = 0;
        int wins = 0;
        int loses = 0;
        for (SportStatistics statistics : matchInfo) {
            if (team.equals(statistics.getHomeTeam())) {
                matches++;
                if (statistics.getHomeTeamPoints() > statistics.getVisitingTeamPoints()) {
                    wins++;
                } else {
                    loses++;
                }
            }
            if (team.equals(statistics.getVisitingTeam())) {
                matches++;
                if (statistics.getVisitingTeamPoints() > statistics.getHomeTeamPoints()) {
                    wins++;
                } else {
                    loses++;
                }
            }
        }
        IO.println("Games: " + matches);
        IO.println("Wins: " + wins);
        IO.println("Loses: " + loses);
    }

    public static void allMatches() {
        ArrayList<SportStatistics> matchInfo = readFromFile();

        int match = 0;
        for (SportStatistics statistics : matchInfo) { 
            match++;
            IO.println(match + ". " + statistics); 
        }
    }

    public static ArrayList<SportStatistics> readFromFile() {
        ArrayList<SportStatistics> info = new ArrayList<>();
        String path = "app/src/main/resources/files/sportData.csv";
        String[] parts;

        String homeTeam;
        String visitingTeam;
        int homeTeamPoints;
        int visitingTeamPoints;

        try (Scanner reader = new Scanner(Paths.get(path))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                parts = line.split(",");

                homeTeam = parts[0];
                visitingTeam = parts[1];
                homeTeamPoints = Integer.valueOf(parts[2]);
                visitingTeamPoints = Integer.valueOf(parts[3]);

                info.add(new SportStatistics(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));

                // IO.println(match + ". Home Team: " + homeTeam + ", Points: " + homeTeamPoints);
                // IO.println(match + ". Visiting Team: " + visitingTeam + ", Points: " + visitingTeamPoints);
            }
        } catch (Exception e) { IO.println("3RR0R" + e.getMessage()); }

        return info;
    }
}
