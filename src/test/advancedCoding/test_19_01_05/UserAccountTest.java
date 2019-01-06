package test.advancedCoding.test_19_01_05;

import main.advancedCoding.test_19_01_05.UserAccount;
import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserAccountTest {

    Set<String> subscriptions;
    UserAccount userAccount;
    UserAccount otherUserAccount1;
    UserAccount otherUserAccount2;

    @BeforeEach
    public void beforeEach(){

        subscriptions = new HashSet<>();
        subscriptions.addAll(List.of(
                "Pluralsight",
                "LinkedIn Learning"));

        userAccount = new UserAccount(
                "danginkgo@yahoo.com",
                "Dan",
                "Rusu",
                "1234",
                500,
                subscriptions);

        otherUserAccount1 = new UserAccount(
                "danginkgo@yahoo.com",
                "D",
                "R",
                "124");

        otherUserAccount2 = new UserAccount(
                "dan.rusu.qa@gmail.com",
                "Dan",
                "Rusu",
                "1234",
                500,
                subscriptions);
    }

    @Nested
    class ToStringTest {

        @Test
        public void constructor2_test() {

            final String EXPECTED_STRING = "danginkgo@yahoo.com, D, R, 0, []";

            Assertions.assertEquals(
                    EXPECTED_STRING,
                    otherUserAccount1.toString());
        }

        @Test
        public void constructor1_test() {

            final String EXPECTED_STRING = "danginkgo@yahoo.com, Dan, Rusu, 500, [Pluralsight, LinkedIn Learning]";

            Assertions.assertEquals(
                    EXPECTED_STRING,
                    userAccount.toString());
        }

    }

    @Nested
    class EqualsTest {
        @Test
        public void positive_test() {
            Assertions.assertEquals(
                    true,
                    userAccount.equals(otherUserAccount1));
        }

        @Test
        public void negative_test() {
            Assertions.assertEquals(
                    false,
                    userAccount.equals(otherUserAccount2));
        }

        @Test
        public void null_test() {
            Assertions.assertEquals(
                    false,
                    userAccount.equals(null));
        }

        @Test
        public void other_type_test() {
            Assertions.assertEquals(
                    false,
                    userAccount.equals(100));
        }
    }
}
