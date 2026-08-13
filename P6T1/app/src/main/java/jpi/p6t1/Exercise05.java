package jpi.p6t1;

import jpi.constructor.SimpleCollection;

public class Exercise05 {
  public static void run() {
    SimpleCollection xMen = new SimpleCollection("X-Men");
    IO.println(xMen);
    IO.println(xMen.longest());

    xMen.add("gambit");
    IO.println(xMen);

    xMen.add("jean grey");
    IO.println(xMen);

    xMen.add("wolverine");
    IO.println(xMen);

    xMen.add("professor xavier");
    IO.println(xMen);

    IO.println(xMen.longest());
  }
}
