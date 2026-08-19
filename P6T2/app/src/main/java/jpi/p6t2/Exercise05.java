package jpi.p6t2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import jpi.constructor.JokeManager;
import jpi.constructor.JokeManagerUI;

public class Exercise05 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();
        JokeManagerUI ui = new JokeManagerUI(manager, scanner);

        ui.start();

        scanner.close();
    }
}
