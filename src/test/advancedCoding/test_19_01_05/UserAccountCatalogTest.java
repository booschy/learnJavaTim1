package test.advancedCoding.test_19_01_05;

import main.advancedCoding.test_19_01_05.UserAccountFailures.AddUserAccountException;
import main.advancedCoding.test_19_01_05.UserAccountFailures.FindUserAccountException;
import main.advancedCoding.test_19_01_05.Subscription;
import main.advancedCoding.test_19_01_05.UserAccount;
import main.advancedCoding.test_19_01_05.UniqueUserAccountCatalog;
import main.advancedCoding.test_19_01_05.UserAccountFailures.RemoveUserAccountException;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.TreeSet;


public class UserAccountCatalogTest {

    TreeSet<Subscription> subscriptions;
    UserAccount userAccount;
    UserAccount userAccount2;

    UniqueUserAccountCatalog userAccountCatalog = new UniqueUserAccountCatalog();

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

        userAccount2 = new UserAccount(
                "danginkgo@gmail.com",
                "Dan",
                "Rusu",
                "1234444",
                5000,
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
        public void size_test() throws AddUserAccountException {

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
        public void added_new_user_is_the_last_in_catalog_test() throws AddUserAccountException {
            userAccountCatalog.addUserAccount(userAccount);
            List<UserAccount> userAccounts = userAccountCatalog.getUserAccounts();

            Assertions.assertEquals(
                    userAccount,
                    userAccounts.get(userAccounts.size() - 1));
        }

        @Test
        public void added_existing_is_the_last_in_catalog_test() throws AddUserAccountException {
            userAccountCatalog.addUserAccount(userAccount);
            Assertions.assertThrows(
                    AddUserAccountException.class,
                    () -> userAccountCatalog.addUserAccount(userAccount));
        }


    }


    @Nested
    class ContainsTest{

        @Test
        public void positive_test() throws AddUserAccountException {
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
        public void positive_test() throws AddUserAccountException, FindUserAccountException {
            userAccountCatalog.addUserAccount(userAccount);

            Assertions.assertEquals(
                    userAccount,
                    userAccountCatalog.find(userAccount));
        }


        @Test
        public void negative_test(){
            Assertions.assertThrows(
                    FindUserAccountException.class,
                    () -> userAccountCatalog.find(userAccount));
        }
    }


    @Nested
    class RemoveUserAccount{
        @Test
        public void posive_test() throws AddUserAccountException {

            userAccountCatalog.addUserAccount(userAccount);
            userAccountCatalog.removeUserAccount(userAccount);

            Assertions.assertEquals(
                    0,
                    userAccountCatalog.getUserAccounts().size(),
                    "accounts size is not 0");
        }

        @Test
        public void negative_empty_catalog_test(){
            Assertions.assertThrows(RemoveUserAccountException.class,
                    () -> userAccountCatalog.removeUserAccount(userAccount));

        }


        @Test
        public void negative_not_empty_catalog_test() throws AddUserAccountException {

            userAccountCatalog.addUserAccount(userAccount);

            Assertions.assertThrows(RemoveUserAccountException.class,
                    () -> userAccountCatalog.removeUserAccount(userAccount2));

        }
    }

}
