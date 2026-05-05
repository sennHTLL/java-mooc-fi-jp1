package jpi.p3;

import java.util.ArrayList;

public class Exercise19{
    public static void run() {
        IO.println("=== EXERCISE 19 ===");
        IO.println("[string] · get sum, average, oldest person, longest name");
        IO.println();

        String[] textTemplate = textTemplate();
        ArrayList<String> names = nameArrayFromTT(textTemplate);
        ArrayList<Integer> ages = ageArrayFromTT(textTemplate);
        mathForTT(textTemplate);
        oldest(names, ages);
        IO.print("Longest name: ");
        longestName(names);
    }

    public static void longestName(ArrayList<String> string) {
        int longest = 0;
        String longName = "";
        for (String text : string) {
            int length = text.length();
            if (longest < length) {
                longest = length;
                longName = text;
            }
        }
        IO.println(longName);
    }

    public static void oldest(ArrayList<String> string, ArrayList<Integer> integer) {
        int max = integer.get(0);
        int maxIndex = 0;
        for (int i = 0; i < integer.size(); i++) {
            if (integer.get(i) > max) {
                max = integer.get(i);
                maxIndex = i;
            }
        }
        IO.println("Age of the oldest: " + max);
        IO.println("Index of the oldest: " + maxIndex);
        IO.println("Name of the oldest: " + string.get(maxIndex));
    }

    public static ArrayList<Integer> ageArrayFromTT(String[] array) {
        ArrayList<Integer> ages = new ArrayList<>();

        for (String text : array) {
            String[] temp = text.split(",");
            ages.add(Integer.valueOf(temp[1]));
        }
        
        return ages;
    }

    public static ArrayList<String> nameArrayFromTT(String[] array) {
        ArrayList<String> names = new ArrayList<>();

        for (String text : array) {
            String[] temp = text.split(",");
            names.add(temp[0]);
        }
        
        return names;
    }

    public static void mathForTT(String[] array) {
        int sum = 0;
        int count = 0;

        for (String text : array) {
            String[] pieces = text.split(",");
            sum += Integer.valueOf(pieces[1]);
            count++;
        }
        
        double average = (double) sum / count;

        IO.println("Sum of age: " + sum);
        if (count > 0) {
            IO.println("Age average: " + average);
        } else {
            IO.println("No input.");
        }
    }
    
    public static String[] textTemplate() {
        String text1 = "Sen,20";
        String text2 = "Jonny,15";
        String text3 = "Emo Jim,30";
        String text4 = "Moon,20";

        String[] textArray = {text1, text2, text3, text4};

        for (String text : textArray) {
            String[] splitted = text.split(",");
            IO.println("Name: " + splitted[0] + ", age: " + splitted[1]);
        }
        IO.println();

        return textArray;
    }
}

