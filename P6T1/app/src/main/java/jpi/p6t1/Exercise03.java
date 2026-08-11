package jpi.p6t1;

import jpi.constructor.Stack;

public class Exercise03 {
  public static void run() {

    Stack s = new Stack();

    checker(s);
    s.add("Value");
    checker(s);
    String taken = s.take();
    checker(s);
    IO.println(taken);

    Stack nums = new Stack();

    for (int i = 1; i <= 5; i++) {
      nums.add(String.valueOf(i));
    }

    while (!nums.isEmpty()) {
      IO.println(nums.take());
    }
  }

  public static void checker(Stack stack) {
    IO.println();
    IO.println(stack.isEmpty());
    IO.println(stack.values());
  }
}
