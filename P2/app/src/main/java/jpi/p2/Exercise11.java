package jpi.p2;

import java.util.Scanner;

public class Exercise11 {

    public static final String ANSI_RESET = "\u001b[0m";
    public static final String ANSI_GREEN = "\u001b[32m";
    public static final String ANSI_BROWN = "\u001b[31m";   // Actually it's red, but it looks like tree trunk

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 11 === ");
        System.out.println(" == christmas tree == ");

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
            printSymbol(ANSI_BROWN + "|" + ANSI_RESET, w);
            System.out.println("");
        }
    }

    // === === === === CONSUMABLES === === === ===

    public static void printSymbol(String symbol, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(ANSI_GREEN + symbol + ANSI_RESET);
        }
    }

    public static void printSymbolRev(String symbol, int num) {
        for (int i = 2; i <= num; i++) {
            System.out.print(ANSI_GREEN + symbol + ANSI_RESET);
        }
    }

    public static void printSpace(int start, int end) {
        for (int i = end; i >= start; i--) {
            System.out.print(" ");
        }
    }
}
