package org.example;

public class Classroom {
    public static void main(String[] args) {

        Wilder wilder1 = new Wilder("Jean-Claude", true);
        Wilder wilder2 = new Wilder("John", false);
        Wilder wilder3 = new Wilder("Mia", true);
        Wilder wilder4 = new Wilder("Lyth", false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
        System.out.println(wilder3.whoAmI());
        System.out.println(wilder4.whoAmI());
    }
}