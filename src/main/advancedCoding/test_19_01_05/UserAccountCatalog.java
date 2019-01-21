package main.advancedCoding.test_19_01_05;

import main.advancedCoding.test_19_01_05.UserAccountFailures.AddUserAccountException;
import main.advancedCoding.test_19_01_05.UserAccountFailures.FindUserAccountException;

import java.util.ArrayList;
import java.util.List;

public abstract class UserAccountCatalog {


    protected List<UserAccount> userAccounts;


    public UserAccountCatalog() {
        userAccounts = new ArrayList<>();
    }


    public List<UserAccount> getUserAccounts() {
        return userAccounts;
    }


    public int getSize(){
        return getUserAccounts().size();
    }


    public abstract void addUserAccount(UserAccount userAccount) throws AddUserAccountException;


    public abstract boolean contains(UserAccount otherUserAccount);


    public abstract UserAccount find(UserAccount otherUserAccount) throws FindUserAccountException;


    public abstract void removeUserAccount(UserAccount userAccount);


    public abstract void addSubscription(Subscription subscription);


    public abstract void removeSubscription(Subscription subscription);
}
