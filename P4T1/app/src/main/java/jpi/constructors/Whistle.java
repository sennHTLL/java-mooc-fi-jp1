package jpi.constructors;

public class Whistle {

    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        IO.println(this.sound);
    }
}
