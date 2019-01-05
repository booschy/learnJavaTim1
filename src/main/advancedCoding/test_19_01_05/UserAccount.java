package main.advancedCoding.test_19_01_05;

import java.util.HashSet;
import java.util.Set;

public final class UserAccount {

    private String email;
    private String firstName;
    private String secondName;
    private String password;
    private int cashCredits;
    private Set<String> subscriptions;

    public UserAccount(String email,
                       String firstName,
                       String secondName,
                       String password,
                       int cashCredits,
                       Set<String> subscriptions) {

        this.email = email;
        this.firstName = firstName;
        this.secondName = secondName;
        this.password = password;
        this.cashCredits = cashCredits;
        this.subscriptions = subscriptions;
    }

    public UserAccount(String email,
                       String firstName,
                       String secondName,
                       String password) {
        this(email,
                firstName,
                secondName,
                password,
                0,
                new HashSet<String>());

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

    public String getPassword() {
        return password;
    }

    public int getCashCredits() {
        return cashCredits;
    }

    public Set<String> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (!(other instanceof UserAccount))return false;

        if (this == other) return true;

        final UserAccount otherUserAccount = (UserAccount) other;
        if (this.email.equals(otherUserAccount.email)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {

        return String.join(", ",
                email,
                firstName,
                secondName,
                cashCredits + "",
                subscriptions.toString());
    }


}

