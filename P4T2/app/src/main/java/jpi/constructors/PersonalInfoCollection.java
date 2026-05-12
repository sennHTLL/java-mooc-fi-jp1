package jpi.constructors;

public class PersonalInfoCollection {

    private String firstName;
    private String lastName;
    private int id;

    public PersonalInfoCollection(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
