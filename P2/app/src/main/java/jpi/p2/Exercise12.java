package jpi.p2;

import java.util.Scanner;

public class Exercise12 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 12 === ");
        System.out.println(" == Diamond Pattern == ");

        int number = 5;
        printTriangle(number);
    }

    public static void printTriangle(int num) {
        for (int i = 1; i <= num; i++) {
            printSpace(i, num);
            printSymbol("*", i);
            printSymbolRev("+", i);
            System.out.println("");
        }
        for (int i = num - 1; i >= 1; i--){
            printSpace(i, num);
            printSymbol("+", i);
            printSymbolRev("*", i);
            System.out.println("");
        }
    }

    public static void printSymbol(String symbol, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(symbol);
        }
    }
    public static void printSymbolRev(String symbol, int num) {
        for (int i = 2; i <= num; i++) {
            System.out.print(symbol);
        }
    }
    public static void printSpace(int start, int end) {
        for (int i = end; i >= start; i--) {
            System.out.print(" ");
        }
    }
}
