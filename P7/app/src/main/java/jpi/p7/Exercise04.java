package jpi.p7;

import java.util.Scanner;

public class Exercise04 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        int allSum = 0;
        int allCount = 0;
        int passSum = 0;
        int passCount = 0;

        int grade_0 = 0;
        int grade_1 = 0;
        int grade_2 = 0;
        int grade_3 = 0;
        int grade_4 = 0;
        int grade_5 = 0;

        IO.println("Enter point totals (-1 stops): ");
        while (true) {
            int userNumber = Integer.valueOf(scanner.nextLine());

            if (userNumber == -1) {
                break;
            }

            if (userNumber >= 0 && userNumber <= 100) {
                allSum += userNumber;
                allCount++;
            }

            if (userNumber >= 50 && userNumber <= 100) {
                passSum += userNumber;
                passCount++;
            }

            if (userNumber >= 90 && userNumber <= 100) {
                grade_5++;
            } else if (userNumber < 50) {
                grade_0++;
            } else if (userNumber < 60) {
                grade_1++;
            } else if (userNumber < 70) {
                grade_2++;
            } else if (userNumber < 80) {
                grade_3++;
            } else if (userNumber < 90) {
                grade_4++;
            }
        }

        IO.println("===== CHECKER =====");
        IO.println("[all sum] · " + allSum);
        IO.println("[all count] · " + allCount);
        IO.println("[pass sum] · " + passSum);
        IO.println("[pass count] · " + passCount);

        double allAvg = (double) allSum / allCount;
        double passAvg = (double) passSum / passCount;
        double passPercentage;
        if (passAvg >= 50) {
            passPercentage = (double) 100 * passCount / allCount;
        } else {
            passPercentage = 0;
        }

        IO.println("===== RESULTS =====");
        IO.println("Point average (all): " + allAvg);
        if (passCount == 0) {
            IO.println("Point average (passing): -");
        } else {
            IO.println("Point average (passing): " + passAvg);
        }
        IO.println("Pass percentage: " + passPercentage);

        IO.println("===== GRADES =====");
        IO.print("5: ");
        stars(grade_5);
        IO.print("\n4: ");
        stars(grade_4);
        IO.print("\n3: ");
        stars(grade_3);
        IO.print("\n2: ");
        stars(grade_2);
        IO.print("\n1: ");
        stars(grade_1);
        IO.print("\n0: ");
        stars(grade_0);
        IO.println();

        scanner.close();
    }

    public static void stars(int num) {
        for (int i = 0; i < num; i++) {
            IO.print("*");
        }
    }
}
