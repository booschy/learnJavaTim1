package main.advancedCoding.test_19_01_05;

import main.advancedCoding.test_19_01_05.Failures.UserAccountCatalogAddException;
import main.advancedCoding.test_19_01_05.Failures.UserAccountCatalogFindException;

import java.util.ArrayList;
import java.util.List;

public class UserAccountCatalog {

    private List<UserAccount> userAccounts;

    public UserAccountCatalog() {
        userAccounts = new ArrayList<>();
    }

    public List<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public void addUserAccount(UserAccount userAccount) throws UserAccountCatalogAddException {
        if(userAccounts.contains(userAccount)){
            throw new UserAccountCatalogAddException();
        }
        userAccounts.add(userAccount);
    }

    public boolean contains(UserAccount otherUserAccount){
        for(UserAccount userAccount : userAccounts){
            if(userAccount.equals(otherUserAccount)){
                return true;
            }
        }
        return false;
    }

    public UserAccount find(UserAccount otherUserAccount) throws UserAccountCatalogFindException {

        for(UserAccount userAccount : userAccounts){
            if(userAccount.equals(otherUserAccount)){
                return userAccount;
            }
        }

        throw new UserAccountCatalogFindException();
    }
}
