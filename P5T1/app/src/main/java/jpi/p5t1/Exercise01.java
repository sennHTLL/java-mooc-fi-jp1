package jpi.p5t1;

import jpi.constructor.Timer;

public class Exercise01 {
    public static void run() {
        IO.println("=== Exercise 01 ===");
        version02();
    }

    public static void version02() {
        Timer timer = new Timer();
        while (true) {
            IO.println(timer);
            timer.advance();
        }
    }

    public static void version01() {
        int seconds = 0;
        int hundredthOfSec = 0;
        int countOfSec = 0;

        while (true) {
            // printing
            if (seconds < 10)
                IO.print("0");
            IO.print(seconds);
            IO.print(":");

            if (hundredthOfSec < 10)
                IO.print("0");
            IO.print(hundredthOfSec);
            IO.println();
            // advance
            hundredthOfSec++;
            if (hundredthOfSec > 100) {
                hundredthOfSec = 0;
                seconds++;
                if (seconds > 60) {
                    seconds = 0;
                    countOfSec++;
                    if (countOfSec == 4) {
                        break;
                    }
                }
            }
        }

        IO.println("Count of sec: " + countOfSec);
    }
}
