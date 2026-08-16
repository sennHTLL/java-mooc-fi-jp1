package jpi.p6t2;

import java.util.Scanner;

import jpi.constructor.TodoList;
import jpi.constructor.UserInterface;

public class Exercise03 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        UserInterface ui = new UserInterface(scanner, list);
        ui.start();
    }
}
