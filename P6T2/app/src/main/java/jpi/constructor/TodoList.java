package jpi.constructor;

import java.util.ArrayList;

public class TodoList {

    public ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        int index = 1;
        for (String task : this.list) {
            IO.println(index + ". " + task);
            index++;
        }
    }

    public void remove(int index) {
        index -= 1;
        list.remove(index);
    }
}
