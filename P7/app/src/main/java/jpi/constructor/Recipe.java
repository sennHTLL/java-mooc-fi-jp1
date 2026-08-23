package jpi.constructor;

import java.util.ArrayList;

public class Recipe {

    private String title;
    private int time;
    ArrayList<String> ingredients;

    public Recipe(String title, int time, ArrayList<String> ingredients) {
        this.title = title;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String getTitleAndTime() {
        return this.title + ", cooking time: " + this.time;
    }
}
