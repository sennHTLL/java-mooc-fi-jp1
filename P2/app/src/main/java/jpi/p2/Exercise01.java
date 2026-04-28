package jpi.p2;

import java.util.Scanner;

public class Exercise01 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 1 === ");
        System.out.println(" == Loopies Poopies == ");

        int ones = 0;
        int nums = 0;
        int sum = 0;
        int neg = 0;
        int pos = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give number (0 for exit)");

        while(true) {    
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 1 || num == -1) ones++;
            if (num == 0) break;
            if (num < 0) neg++;
            if (num > 0) pos++;
            if (num % 2 == 0) even++;
            if (num % 2 != 0) odd++;

            sum += num;
            nums++;
        }

        if (nums == 0) {
            System.out.println("Can't divide by zero");
        } else {
            int avg = sum / nums;
            System.out.println("Average of numbers: " + avg);
        }

        System.out.println("Sum of ones: " + ones);
        System.out.println("Numbers: " + nums);
        System.out.println("Negative: " + neg);
        System.out.println("Positive: " + pos);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Sum: " + sum);

        if (pos + neg > 0) {
            double posPercent = 100.0 * pos / (pos + neg);
            System.out.println("Percentage of positive: " + posPercent + "%");
        }
    }
}
