package jpi.p2;

public class Exercise08 {
    public static void run() {
        System.out.println(" === EXERCISE 8 === ");
        System.out.println(" == Math methods == ");

        int min = 2;
        int max = 12;

        divisibleByFourInRange(min, max);
        System.out.println();

        min = 6;
        divisibleByFourInRange(min, max);
    }

    public static void divisibleByFourInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 4 == 0) System.out.println(i);
        }
    }
}
