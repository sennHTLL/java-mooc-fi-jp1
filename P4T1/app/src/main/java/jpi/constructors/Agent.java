package jpi.constructors;

public class Agent {

    private String firstName;
    private String lastName;
    private String fullName;

    public Agent(String initialFirstName, 
                 String initialLastName) {
        this.firstName = initialFirstName;
        this.lastName = initialLastName;
        this.fullName = initialFirstName + " " + initialLastName;
    }

    public String toString() {
        return "My name is " + this.lastName + ", " + this.fullName;
    }
}
