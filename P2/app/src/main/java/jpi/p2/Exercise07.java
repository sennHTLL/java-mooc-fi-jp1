package jpi.p2;

public class Exercise07 {
    public static void run() {
        // Scanner scanner = new Scanner(System.in);
        System.out.println(" === EXERCISE 7 === ");
        System.out.println(" == Parameters == ");
        
        System.out.println("Print from 1 to parameter");
        printUntilNumber(5);

        System.out.println("Print from parameter to 1");
        printFromNumber(5);
    }

    public static void printUntilNumber(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void printFromNumber(int num) {
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
