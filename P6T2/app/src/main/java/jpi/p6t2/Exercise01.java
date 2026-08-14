package jpi.p6t2;

import java.util.Scanner;

import jpi.constructor.UserInterface;
import jpi.constructor.WordSet;

public class Exercise01 {
  public static void run() {
    Scanner scanner = new Scanner(System.in);
    WordSet set = new WordSet();

    UserInterface userInterface = new UserInterface(scanner, set);
    userInterface.start();
  }
}
