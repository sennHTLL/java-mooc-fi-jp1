package jpi.p4t2;

import java.util.ArrayList;
import java.util.Scanner;

import jpi.constructors.TelevisionPrograms;

public class Exercise04 {
    public static void run() {
        IO.println("=== EXERCISE 03 ===");
        IO.println("[oop] · object in list");

        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionPrograms> tvPrograms = new ArrayList<>();

        IO.println("Enter program name and duration divided by comma. E.g. Show,30");
        while (true) {
            IO.print("Enter: ");
            String tvProgramInfo = scanner.nextLine();
            if (tvProgramInfo.isEmpty()) break;

            String[] tvProgramParts = tvProgramInfo.split(",");

            String tvProgramName = tvProgramParts[0];
            int tvProgramDuration = Integer.valueOf(tvProgramParts[1]);

            tvPrograms.add(new TelevisionPrograms(tvProgramName, tvProgramDuration));
        }

        IO.print("TV Program's maximum duration? ");
        int tvProgramMaxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionPrograms tvProgram : tvPrograms) {
            if (tvProgram.getDuration() <= tvProgramMaxDuration) {
                IO.println(tvProgram);
            }
        }
    }
}
