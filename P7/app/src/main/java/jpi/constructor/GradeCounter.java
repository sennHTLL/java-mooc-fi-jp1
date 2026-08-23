package jpi.constructor;

public class GradeCounter {

    private int[] gradeCount;

    public GradeCounter() {
        this.gradeCount = new int[6];
    }

    public void add(int score) {
        int grade;

        if (score >= 90 && score <= 100) {
            grade = 5;
        } else if (score >= 80) {
            grade = 4;
        } else if (score >= 70) {
            grade = 3;
        } else if (score >= 60) {
            grade = 2;
        } else if (score >= 50) {
            grade = 1;
        } else {
            grade = 0;
        }

        this.gradeCount[grade]++;
    }

    public void print() {
        IO.println("===== GRADES =====");
        for (int i = 5; i >= 0; i--) {
            IO.print(i + ": ");
            stars(gradeCount[i]);
            IO.println();
        }
    }

    public static void stars(int num) {
        for (int i = 0; i < num; i++) {
            IO.print("*");
        }
    }
}
