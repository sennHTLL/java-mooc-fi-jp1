package jpi.constructor;

import java.util.ArrayList;

public class Recipe {

    private String title;
    private String time;
    ArrayList<String> ingredients;

    public Recipe(String title, String time, ArrayList<String> ingredients) {
        this.title = title;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
}
