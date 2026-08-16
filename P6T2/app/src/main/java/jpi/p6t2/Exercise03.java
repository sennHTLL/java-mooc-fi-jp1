package jpi.p6t2;

import jpi.constructor.TodoList;

public class Exercise03 {
    public static void run() {
        TodoList list = new TodoList();

        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        list.print();
        list.remove(2);

        IO.println();
        list.print();

        IO.println();
        list.add("buy raisins");
        list.print();

        list.remove(1);
        list.remove(1);

        IO.println();
        list.print();
    }
}
