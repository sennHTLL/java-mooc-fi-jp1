package jpi.p5;
import jpi.constructor.Clock;
import jpi.constructor.ClockHand;

public class Exercise00 {

    public static void run() {
        IO.println("=== Exercise 00 ===");
        version03();
    }

    public static void version03() {
        Clock clock = new Clock();
        while (true) {
            IO.println(clock);
            clock.advance();
        }
    }

    public static void version02() {
        ClockHand hours = new ClockHand(24);
        ClockHand minutes = new ClockHand(60);
        ClockHand seconds = new ClockHand(60);

        while (true) {
            IO.println(hours + ":" + minutes + ":" + seconds);
            
            seconds.advance();
            
            if (seconds.value() == 0) {
                minutes.advance();
                if (minutes.value() == 0) {
                    hours.advance();
                }
            }
        }
    }

    public static void version01() {
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        while (true) {
            // printing time
            if (hours < 10) IO.print("0");
            IO.print(hours);
            IO.print(":");

            if (minutes < 10) IO.print("0");
            IO.print(minutes);
            IO.print(":");

            if (seconds < 10) IO.print("0");
            IO.print(seconds);
            IO.println();

            // second hand progress
            seconds++;

            // other hand progress
            if (seconds > 59) {
                minutes++;
                seconds = 0;
                if (minutes > 59) {
                    hours++;
                    minutes = 0;
                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }
        }
    }
}
