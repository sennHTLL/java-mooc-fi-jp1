package jpi.p3;

import java.util.ArrayList;

public class Exercise18 {
    public static void run() {
        IO.println("=== EXERCISE 18 ===");
        IO.println("[string] · sEcReT mEsSaGe");
        IO.println();

        String text1 = "Polymorphous complutations elaborate";
        String text2 = "Real calculators honour";
        String text3 = "Older desktops deliver";
        String text4 = "Great mainframes link";
        String text5 = "Reversed devices install";
        String text6 = "Additional workstations modem";
        String text7 = "Many microcomputers letter";
        
        String[] array = {text1, text2, text3, text4, text5, text6, text7};
        for (String text : array) {
            IO.println(text);
        }
        IO.println();

        takeOneChar(array);
        IO.println();
    }

    public static void takeOneChar(String[] array){
        ArrayList<Character> characters = new ArrayList<>();
        for (String text : array) {
            char character = text.charAt(0);
            characters.add(character);
        }
        for (int i = 0; i < characters.size(); i++){
            IO.print(characters.get(i));
        }
    }
}
