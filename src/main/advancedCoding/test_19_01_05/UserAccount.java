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
                       String password){
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
    public boolean equals(Object otherObject) {

        if (false == isOtherObjectValid(otherObject)) return false;

        final UserAccount otherUserAccount = (UserAccount) otherObject;

        if (this.email.equals(otherUserAccount.email)){
            return true;
        }

        return false;
    }

     private boolean isOtherObjectValid(Object otherObject) {
        if (otherObject == null){
            return false;
        }

        final String otherUserAccountObjectClassName = otherObject
                .getClass().getSimpleName();

        if (false == otherUserAccountObjectClassName.equals("UserAccount")){
            return false;
        }

        return true;
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

