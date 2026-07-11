package jpi.p5t2;

import jpi.constructor.SimpleDate;

public class Exercise09 {
    public static void run() {
        IO.println("=== [xercise] · 9 ===");

        test1();
        IO.println();

        SimpleDate date = new SimpleDate(13, 2, 2006);
        IO.println("Friday of examined week is " + date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            IO.println("Friday after " + week + " week is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
            week++;
        }
    }

    public static void test1() {
        SimpleDate date1 = new SimpleDate(29, 5, 2006);
        SimpleDate date2 = new SimpleDate(29, 11, 2006);
        SimpleDate date3 = new SimpleDate(29, 12, 2006);
        
        int n = 1;

        IO.println("==== date · 1 ====");
        for (int i = 0; i < 5; i++) {
            IO.println(date1);
            date1.advance(n);
        }

        IO.println("==== date · 2 ====");
        for (int i = 0; i < 5; i++) {
            IO.println(date2);
            date2.advance(n);
        }
        
        IO.println("==== date · 3 ====");
        for (int i = 0; i < 5; i++) {
            IO.println(date3);
            date3.advance(n);
        }
    }
}
