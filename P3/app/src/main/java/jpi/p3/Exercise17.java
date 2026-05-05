package jpi.p3;

public class Exercise17{
    public static void run() {
        IO.println("=== EXERCISE 17 ===");

        // == TEXT TEMPLATES == \\
        String textOne = "Java is a programming language";
        String textTwo = "this a navy blue shirt";
        String textThree = "Do you have a favorite flavor";
        String textFour = "was it a cat?";
        // == TEXT TEMPLATE · OUTPUTS == \\
        IO.println(textOne);
        IO.println(textTwo);
        IO.println(textThree);
        IO.println(textFour);
        IO.println();
        // == TEXT TEMPLATE · ARRAYS == \\
        String[] piecesOne = splitting(textOne);
        String[] piecesTwo = splitting(textTwo);
        String[] piecesThree = splitting(textThree);
        String[] piecesFour = splitting(textFour);

        IO.println("[string] · split text and output only that contains 'av'");
        avContainsOutput(piecesOne);
        avContainsOutput(piecesTwo);
        avContainsOutput(piecesThree);
        avContainsOutput(piecesFour);
        IO.println();

        IO.println("[string] · FW ·LW");
        firstWordLastWord(piecesOne);
    }
    public static void firstWordLastWord(String[] array) {
        int first = 0;
        int last = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (i == first) IO.print(array[i] + " · ");
            if (i == last) IO.println(array[i]);
        }
    }

    public static void avContainsOutput(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("av")) {
                IO.println(array[i]);
            }
        }
    }

    public static String[] splitting(String text) {
        String[] splitted = text.split(" ");
        return splitted;
    }
} 
