package test.advancedCoding.test_19_01_05;

import main.advancedCoding.test_19_01_05.Failures.UserAccountCatalogAddException;
import main.advancedCoding.test_19_01_05.Failures.UserAccountCatalogFindException;
import main.advancedCoding.test_19_01_05.Subscription;
import main.advancedCoding.test_19_01_05.UserAccount;
import main.advancedCoding.test_19_01_05.UserAccountCatalog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.TreeSet;

public class UserAccountCatalogTest {

    TreeSet<Subscription> subscriptions;
    UserAccount userAccount;

    UserAccountCatalog userAccountCatalog = new UserAccountCatalog();

    @BeforeEach
    public void beforeEach() {
        subscriptions = new TreeSet<>();
        subscriptions.addAll(List.of(
                Subscription.LINKEDIN_LEARNING,
                Subscription.PLURALSIGHT
        ));

        userAccount = new UserAccount(
                "danginkgo@yahoo.com",
                "Dan",
                "Rusu",
                "1234",
                500,
                subscriptions);
    }

    @Test
    public void catalog_creation_test() {

        final boolean isUserAccountCatalogEmpty = userAccountCatalog.getUserAccounts().isEmpty();

        Assertions.assertEquals(
                true,
                isUserAccountCatalogEmpty);
    }

    @Nested
    class AddUserAccountTest {
        @Test
        public void size_test() throws UserAccountCatalogAddException {

            userAccountCatalog.addUserAccount(userAccount);
            List<UserAccount> userAccounts = userAccountCatalog.getUserAccounts();

/*        Assertions.assertEquals(
                false,
                userAccounts.isEmpty(),
                "accounts list is empty after adding a new UserAccount");*/

            Assertions.assertEquals(
                    1,
                    userAccounts.size(),
                    "accounts list size is not 1 after adding a new UserAccount");
        }

        @Test
        public void added_new_user_is_the_last_in_catalog_test() throws UserAccountCatalogAddException {
            userAccountCatalog.addUserAccount(userAccount);
            List<UserAccount> userAccounts = userAccountCatalog.getUserAccounts();

            Assertions.assertEquals(
                    userAccount,
                    userAccounts.get(userAccounts.size() - 1));
        }

        @Test
        public void added_existing_is_the_last_in_catalog_test() throws UserAccountCatalogAddException {
            userAccountCatalog.addUserAccount(userAccount);
            Assertions.assertThrows(
                    UserAccountCatalogAddException.class,
                    () -> userAccountCatalog.addUserAccount(userAccount));
        }


    }

    @Nested
    class ContainsTest{

        @Test
        public void positive_test() throws UserAccountCatalogAddException {
            userAccountCatalog.addUserAccount(userAccount);

            Assertions.assertEquals(
                    true,
                    userAccountCatalog.contains(userAccount));
        }

        @Test
        public void negative_test(){

            Assertions.assertEquals(
                    false,
                    userAccountCatalog.contains(userAccount));
        }
    }

    @Nested
    class FindTest{

        @Test
        public void positive_test() throws UserAccountCatalogAddException, UserAccountCatalogFindException {
            userAccountCatalog.addUserAccount(userAccount);

            Assertions.assertEquals(
                    userAccount,
                    userAccountCatalog.find(userAccount));
        }

        @Test
        public void negative_test(){
            Assertions.assertThrows(
                    UserAccountCatalogFindException.class,
                    () -> userAccountCatalog.find(userAccount));
        }
    }


}
