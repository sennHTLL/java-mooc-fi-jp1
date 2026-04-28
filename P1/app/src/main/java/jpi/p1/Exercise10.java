package jpi.p1;

import java.util.Scanner;

public class Exercise10 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 10 === ");
        System.out.println(" == Logical operators == ");

        System.out.println("Fizz Buzz? ");
        int num = Integer.valueOf(scanner.nextLine());
        int fizz = num % 3;
        int buzz = num % 5;

        if (fizz == 0 && buzz == 0) {
            System.out.println("FizzBuzz");
        } else if (fizz == 0) {
            System.out.println("Fizz");
        } else if (buzz == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
