package jpi.p2;

import java.util.Scanner;

public class Exercise04 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 4 === ");
        System.out.println(" == Sum of sequence == ");

        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;

        for (int i = firstNum; i <= lastNum; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }
}
