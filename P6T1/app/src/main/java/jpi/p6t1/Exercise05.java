package jpi.p6t1;

import jpi.constructor.SimpleCollection;

public class Exercise05 {
  public static void run() {
    SimpleCollection sc = new SimpleCollection("characters");
    IO.println(sc);

    sc.add("gambit");
    IO.println(sc);

    sc.add("jean grey");
    IO.println(sc);

    sc.add("wolverine");
    IO.println(sc);
  }
}
