package jpi.p2;

import java.util.Scanner;

public class Exercise11 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 11 === ");
        System.out.println(" == Christmas Tree == ");

        String symbolInput = scanner.nextLine();

        int start = 1;
        int height = 4;
        printChristmasTree(symbolInput, start, height);
    }

    public static void printChristmasTree(String symbol, int start, int height) {
        for (int i = start; i <= height; i++) {
            printSpace(i, height);
            printSymbol("/", i);
            printSymbolRev(symbol, i);
            System.out.println("");
        }

        // === === TRUNK === ===
        int w = 3; int h = 2;

        for (int i = h; i <= w; i++) {
            printSpace(h, height);
            printSymbol("|", w);
            System.out.println("");
        }
    }

    // === === === === CONSUMABLES === === === ===

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
