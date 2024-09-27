package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class Main {
    public static void main(String[] args) {
        // Δημιουργία instance της κλάσης User
        User user = new User(1L, "Athanasios", "Androutsos");

        // Δημιουργία instance της κλάσης UserCredentials
        UserCredentials userCredentials = new UserCredentials(1L, "a.androutsos", "password123");

        // Εμφάνιση των πεδίων των instances
        System.out.println(user);
        System.out.println(userCredentials);
    }
}
