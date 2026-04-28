package jpi.p2;

public class Exercise09 {
    public static void run() {
        System.out.println(" === EXERCISE 9 === ");
        System.out.println(" == Method type returns == ");

        int num1 = 4; 
        int num2 = 7; 
        int num3 = 6; 
        int num4 = 1;

        int sum = sum(num1, num2, num3, num4);
        System.out.println("Sum: " + sum);

        double average = average(num1, num2, num3, num4);
        System.out.println("Average: " + average);

        int small = smallest(num1, num2);
        System.out.println("Smallest: " + small);

        int greater = greatest(num1, num2, num3);
        System.out.println("Greatest: " + greater);
    }

    public static int sum(int number1, int number2, int number3, int number4) {
        int sum = number1 + number2 + number3 + number4;
        return sum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int sum = sum(number1, number2, number3, number4);
        double average = (double) sum / 4;
        return average;
    }

    public static int smallest(int number1, int number2) {
        int small = 0;
        if (number1 > number2) {
            small = number2;
        } else {
            small = number1;
        }

        return small;
    }

    public static int greatest(int number1, int number2, int number3) {
        // int greater = 0;
        //
        // if (number1 > number2 && number1 > number3) {
        //     greater = number1;
        // } else if (number2 > number1 && number2 > number3){
        //     greater = number2;
        // } else {
        //     greater = number3;
        // }

        int max = number1;
        
        for (int i = 0; i < 2; i++) {
            int currentNum = (i == 0) ? number2 : number3;

            if (currentNum > max) {
                max = currentNum;
            }
        }

        return max;
    }
}
