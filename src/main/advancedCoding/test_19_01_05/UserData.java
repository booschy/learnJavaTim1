package main.advancedCoding.test_19_01_05;

public class UserData {

    String email;
    String firstName;
    String secondName;

    public UserData(String email, String firstName, String secondName) {
        this.email = email;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
