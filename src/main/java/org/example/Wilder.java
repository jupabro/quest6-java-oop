package org.example;

public class Wilder {

    private String firstName;
    private boolean present;

    public Wilder(String firstName, boolean present) {
        this.firstName = firstName;
        this.present = present;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI() {
        String presenceStatus = this.present ? "present" : "not present";
        return "My name is " + this.firstName + " and I am " + presenceStatus;
    }
}
