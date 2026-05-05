package jpi.p3;

import java.util.Scanner;

public class Exercise14 {
    public static void run() {
        IO.println(" === EXERCISE 14 === ");
        Scanner scanner = new Scanner(System.in);

        IO.println("[array] · user creates array");
        int[] array = uCreatesArray(scanner);

        IO.println("Here are the array:");
        for (int i = 0; i < array.length; i++) {
            IO.println(array[i]);
        }
    }

    public static int[] uCreatesArray(Scanner scanner){
        IO.print("Enter size of array: ");
        int uArraySize = Integer.valueOf(scanner.nextLine());

        int[] uArray = new int[uArraySize];
        
        IO.println("Enter elements of array - numbers:");
        for(int i = 0; i < uArray.length; i++){
            int uElements = Integer.valueOf(scanner.nextLine());
            uArray[i] = uElements;
        }

        return uArray;
    }
}
