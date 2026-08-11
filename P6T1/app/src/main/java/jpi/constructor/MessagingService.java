package jpi.constructor;

import java.util.ArrayList;

public class MessagingService {

  private ArrayList<Message> messageList;

  public MessagingService() {
    this.messageList = new ArrayList<>();
  }

  public void add(Message message) {
    this.messageList.add(message);
  }

  public ArrayList<Message> getMessages() {
    return this.messageList;
  }
}
