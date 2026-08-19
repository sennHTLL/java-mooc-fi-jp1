package jpi.constructor;

import java.util.Scanner;

public class JokeManagerUI {

    private Scanner scanner;
    private JokeManager manager;

    public JokeManagerUI(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }

    public void start() {
        while (true) {
            IO.println("commands:");
            IO.println("1 - add a joke");
            IO.println("2 - draw a joke");
            IO.println("3 - list jokes");
            IO.println("x - stop");

            String command = this.scanner.nextLine();

            if (command.equals("x")) {
                break;
            }

            if (command.equals("1")) {
                IO.println("write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.manager.addJoke(joke);
            } else if (command.equals("2")) {
                for (int i = 0; i < 5; i++) {
                    IO.println(this.manager.drawJokes());
                }
            } else if (command.equals("3")) {
                IO.println("printing jokes");
                this.manager.printJokes();
            }
        }
    }
}
