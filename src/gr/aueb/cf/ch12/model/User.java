package gr.aueb.cf.ch12.model;

public class User {
    private Long id;
    private String firstname;
    private String lastname;

    // Default constructor
    public User() {
    }

    // Overloaded constructor
    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Getters
    public Long getId() {
        return id;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    // Η μέθοδος toString για εκτύπωση
    @Override
    public String toString() {
        return "User{id=" + id + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
    }
}
