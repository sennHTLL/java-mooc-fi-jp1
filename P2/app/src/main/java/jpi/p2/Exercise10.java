package jpi.p2;

import java.util.Scanner;

public class Exercise10 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 10 === ");
        System.out.println(" == Figures == ");

        System.out.print("Enter one symbol for every figure print: ");
        String symbolInput = scanner.nextLine();

        System.out.println(" = SQUARE = ");
        System.out.print("Input size for square: ");
        int squareSize = Integer.valueOf(scanner.nextLine());
        printSquare(symbolInput, squareSize);

        System.out.println(" = RECTANGLE = ");
        System.out.print("Input width for rectangle: ");
        int rectWidth = Integer.valueOf(scanner.nextLine());
        System.out.print("Input height for rectangle: ");
        int rectHeight = Integer.valueOf(scanner.nextLine());
        printRectangle(symbolInput, rectWidth, rectHeight);

        System.out.println(" = TRIANGLE = ");
        System.out.print("Input start size for triangle: ");
        int triangleStartSize = Integer.valueOf(scanner.nextLine());
        System.out.print("Input end size for triangle: ");
        int triangleEndSize = Integer.valueOf(scanner.nextLine());
        printTriangle(symbolInput, triangleStartSize, triangleEndSize);

        System.out.println(" = TRIANGLE REVERSE = ");
        System.out.print("Input start size for triangle: ");
        int triangleRevStartSize = Integer.valueOf(scanner.nextLine());
        System.out.print("Input end size for triangle: ");
        int triangleRevEndSize = Integer.valueOf(scanner.nextLine());
        printTriangleReverse(symbolInput, triangleRevStartSize, triangleRevEndSize);
    }

    public static void printSquare(String symbol, int size) {
        for (int i = size; i < size + 1; i++) {
            for (int j = 1; j <= size; j++) {
                printSymbol(symbol, size);
                System.out.println("");
            }
        }
    }

    public static void printRectangle(String symbol, int width, int height) {
        for (int i = width; i < width + 1; i++) {
            for (int j = 1; j <= height; j++) {
                printSymbol(symbol, width);
                System.out.println("");
            } 
        }
    }

    public static void printTriangle(String symbol, int start, int end) {
        for (int i = start; i <= end; i++) {
            printSymbol(symbol, i);
            System.out.println("");
        }
    }

    public static void printTriangleReverse(String symbol, int start, int end) {
        for (int i = start; i <= end; i++) {
            printSpaces(i, end);
            printSymbol(symbol, i);
            System.out.println("");
        }
    }

    public static void printSymbol(String symbol , int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(symbol);
        }
    }

    public static void printSymbolRev(String symbol, int num) {
        for (int i = 2; i <= num; i++) {
            System.out.print(symbol); // I spend 40 minutes to solve problem and it was "println" instead of "print"...
        }
    }

    public static void printSpaces(int start, int end) {
        for (int i = end; i >= start; i--) {
            System.out.print(" ");
        }
    }
}
