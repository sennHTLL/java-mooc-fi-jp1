package jpi.p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise13 {
    public static void run() {
        System.out.println(" === EXERCISE 13 === ");
        System.out.println(" == Arrays == ");
        Scanner scanner = new Scanner(System.in);
        
        int[] numArray = arrayIdentifier();
        int arrayIndexEnd = numArray.length - 1;
        IO.println("Give two indices to swap (from 0 to " + arrayIndexEnd + ")");
        int uIndexOne = Integer.valueOf(scanner.nextLine());
        int uIndexTwo = Integer.valueOf(scanner.nextLine());
        // =!= u stays for user =!= \\
        IO.println("Original array element order: ");
        arrayPrint(numArray);
        IO.println("Here is swapped array: ");
        arraySwapping(numArray, uIndexOne, uIndexTwo);

        // == == SEARCH FOR == == \\
        IO.print("Search for? ");
        searchFor(scanner, numArray);
    }

    public static void searchFor(Scanner scanner, int[] array) {
        int uNumSearch = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> iCompare = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == uNumSearch) iCompare.add(i);
        }

        if (iCompare.size() == 0) IO.println(uNumSearch + " was not found");

        for (int i = 0; i < iCompare.size(); i++) {
            IO.println(uNumSearch + " is at index " + iCompare.get(i));
        }
    }
    public static void arraySwapping(int[] array, int numOne, int numTwo){
        // ~~~ i didn't even think about this style accessing to index ~~~ \\
        int swapHelper = array[numOne];
        array[numOne] = array[numTwo];
        array[numTwo] = swapHelper;
        for (int i = 0; i < array.length; i++) {
            IO.println(array[i]);
        }
    }

    public static void arrayPrint(int[] array) {
        for(int i = 0; i < array.length; i++){
            IO.println(array[i]);
        }
    }

    public static int[] arrayIdentifier() {
        int[] numArray = new int[5];

        numArray[0] = 1;
        numArray[1] = 3;
        numArray[2] = 5;
        numArray[3] = 7;
        numArray[4] = 3;

        return numArray;
    }
}
