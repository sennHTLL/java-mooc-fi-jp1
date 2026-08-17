package jpi.constructor;

import java.util.Scanner;

public class GradeUI {

    private GradeRegister register;
    private Scanner scanner;

    public GradeUI(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    public void start() {
        readPoints();
        IO.println();

        printGradeDistribution();
        IO.println();

        IO.println("The average of points: " + register.averageOfPoints());
        IO.println("The average of grades: " + register.averageOfGrades());
    }

    public void readPoints() {
        while (true) {
            IO.print("Points: ");
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            int score = Integer.valueOf(input);

            if (score < 0 || score > 100) {
                IO.println("Impossible number");
                continue;
            }

            register.addGradeBasedOnPoints(score);
        }
    }

    public void printGradeDistribution() {
        int grade = 5;

        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);

            IO.print(grade + ": ");
            printStars(stars);
            IO.println("");

            grade -= 1;
        }
    }

    public void printStars(int stars) {
        while (stars > 0) {
            IO.print("*");
            stars--;
        }
    }
}
