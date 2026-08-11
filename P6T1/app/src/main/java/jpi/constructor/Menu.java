package jpi.constructor;

import java.util.ArrayList;

public class Menu {
  private ArrayList<String> meals;

  public Menu() {
    this.meals = new ArrayList<>();
  }

  public void addMeal(String meal) {
    if (this.meals.contains(meal)) {
    } else {
      this.meals.add(meal);
    }
  }

  public void removeMeal(String meal) {
    this.meals.remove(meal);
  }

  public void printMeals() {
    for (String meal : this.meals) {
      IO.println(meal);
    }
  }

  public void clearMenu() {
    this.meals.clear();
  }
}
