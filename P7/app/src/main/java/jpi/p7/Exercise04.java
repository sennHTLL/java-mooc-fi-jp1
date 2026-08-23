package jpi.p7;

import java.util.Scanner;

import jpi.constructor.GradeCounter;
import jpi.constructor.GradePoint;

public class Exercise04 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        GradePoint all = new GradePoint();
        GradePoint pass = new GradePoint();
        GradeCounter counter = new GradeCounter();

        IO.println("Enter point totals (-1 stops):");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                all.updSum(point);
                all.updCount();
                counter.add(point);
            }

            if (point >= 50 && point <= 100) {
                pass.updSum(point);
                pass.updCount();
            }
        }

        IO.println("===== RESULTS =====");
        all.updAvg();
        IO.println("Point average (all): " + all.getAvg());
        if (pass.getCount() == 0) {
            IO.println("Point average (passing): -");
        } else {
            pass.updAvg();
            IO.println("Point average (passing): " + pass.getAvg());

            if (pass.getAvg() >= 50) {
                pass.updPercentage(pass.getCount(), all.getCount());
            } else {
                pass.updPercentage(0, 1);
            }
            IO.println("Pass percentage: " + pass.getPercentage());
        }

        counter.print();

        IO.println();
        scanner.close();
    }

}
