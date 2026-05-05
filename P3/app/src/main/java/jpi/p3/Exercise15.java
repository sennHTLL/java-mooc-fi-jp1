package jpi.p3;

import java.util.Scanner;

public class Exercise15 {
    public static void run() {
        IO.println(" === EXERCISE 15 === ");
        Scanner scanner = new Scanner(System.in);

        int[] numArray = {5, 1, 3, 4, 2};

        IO.println("Here are the array:");
        for (int i = 0; i < numArray.length; i++) {
            IO.println(numArray[i]);
        }

        IO.println("[array] · sum of array elements");
        IO.println("Sum of your array is " + arrayNumSum(numArray));

        IO.println("[array] · print array neatly");
        arrayPrintNeatly(numArray);

        IO.println("[array] · print array in stars");
        arrayPrintInStars(numArray);
    }

    public static void arrayPrintInStars(int[] array) {
        String charString = "*";
        for (int i = 0; i < array.length; i++){
            printSymbol(charString, array[i]);
            IO.println("");
        }
    }

    public static void printSymbol(String symbol, int num) {
        for (int i = 1; i <= num; i++) {
            IO.print(symbol);
        }
    }

    public static void arrayPrintNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1){
                IO.print(array[i] + ", ");
            } else {
                IO.println(array[i]);
            }
        }
    }

    public static int arrayNumSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
