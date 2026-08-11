package jpi.p6t1;

import jpi.constructor.Menu;

public class Exercise02 {
  public static void run() {
    Menu menu = new Menu();
    menu.addMeal("tofu");
    menu.addMeal("pizza");
    menu.addMeal("tofu");
    menu.addMeal("pasta");
    menu.addMeal("soup");

    menu.printMeals();
    menu.clearMenu();

    IO.println();
    menu.addMeal("mozarella");
    menu.printMeals();
  }
}
