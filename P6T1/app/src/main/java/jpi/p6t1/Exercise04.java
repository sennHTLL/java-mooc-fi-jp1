package jpi.p6t1;

import jpi.constructor.Message;
import jpi.constructor.MessagingService;

public class Exercise04 {
  public static void run() {
    Message m1 = new Message("hello");
    Message m2 = new Message("hi");
    Message m3 = new Message("bonjour, mon ami");

    MessagingService ms = new MessagingService();

    ms.add(m1);
    ms.add(m2);
    ms.add(m3);

    IO.println(ms.getMessages());
    IO.println("YO");
  }
}
