package jpi.p6t2;

import java.util.Scanner;

import jpi.constructor.GradeRegister;
import jpi.constructor.GradeUI;

public class Exercise04 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();

        GradeUI ui = new GradeUI(register, scanner);
        ui.start();

        scanner.close();
    }
}
