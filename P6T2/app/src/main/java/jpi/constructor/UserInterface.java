package jpi.constructor;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(Scanner scanner, TodoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            IO.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equals("close")) {
                IO.println("Bai bai");
                break;
            } else if (command.equals("add")) {
                String task = this.scanner.nextLine();
                list.add(task);
            } else if (command.equals("list")) {
                list.print();
            } else if (command.equals("remove")) {
                IO.print("Which one is removed? ");
                int index = Integer.valueOf(this.scanner.nextLine());
                list.remove(index);
            }
        }
    }
}
