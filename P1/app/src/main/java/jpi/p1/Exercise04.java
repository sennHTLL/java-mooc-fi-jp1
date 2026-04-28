package jpi.p1;

// IMPORTS
import java.util.Scanner;

public class Exercise04 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" === EXERCISE 4 === ");
        System.out.println(" == Story == ");

        System.out.println("Greetings! I will tell  you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String characterName = scanner.nextLine();
        System.out.println("What's their job?");
        String characterJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was " + characterName + ", who was a " + characterJob + ". ");
        System.out.println("On the way to work, " + characterName + " reflected on life.");
        System.out.println("Perhaps " + characterName + " will not be a " + characterJob + " forever.");
    }
}
