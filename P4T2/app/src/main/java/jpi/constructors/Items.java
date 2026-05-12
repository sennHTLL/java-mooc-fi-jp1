package jpi.constructors;

import java.time.LocalDateTime;

public class Items {

    private String name;

    public Items(String objName) {
        this.name = objName;
    }

    public String toString() {
        LocalDateTime createdAt = LocalDateTime.now();
        return this.name + " (created at: " + createdAt + ")";
    }
}
