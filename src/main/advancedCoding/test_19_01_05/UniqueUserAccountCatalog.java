package main.advancedCoding.test_19_01_05;

import main.advancedCoding.test_19_01_05.UserAccountFailures.AddUserAccountException;
import main.advancedCoding.test_19_01_05.UserAccountFailures.FindUserAccountException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* Homework code + unit tests
-remove user account by email
- add subscription
-remove subscription
-gets catalog's size.*/

public class UniqueUserAccountCatalog extends UserAccountCatalog{
/*
    key - subscription

    value - a list of (email, first name, second name) for
    the accounts that have the key subscription*/

    Map<Subscription, UserData> subscriptionInfo;

    public Map<Subscription, UserData> getSubscriptionInfo() {
        return subscriptionInfo;
    }

    @Override
    public void addUserAccount(UserAccount userAccount) throws AddUserAccountException {
        if(userAccounts.contains(userAccount)){
            throw new AddUserAccountException();
        }
        userAccounts.add(userAccount);
    }

    @Override
    public boolean contains(UserAccount otherUserAccount){
        for(UserAccount userAccount : userAccounts){
            if(userAccount.equals(otherUserAccount)){
                return true;
            }
        }
        return false;
    }

    @Override
    public UserAccount find(UserAccount otherUserAccount) throws FindUserAccountException {

        for(UserAccount userAccount : userAccounts){
            if(userAccount.equals(otherUserAccount)){
                return userAccount;
            }
        }

        throw new FindUserAccountException();
    }

    @Override
    public void removeUserAccount(UserAccount userAccount) {

    }

    @Override
    public void addSubscription(Subscription subscription) {

    }

    @Override
    public void removeSubscription(Subscription subscription) {

    }
}
