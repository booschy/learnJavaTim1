package bank;

public class BankAccountTest {


    public static void main(String[] args) {

        Person employee1 = new Person(
                "John",
                Employer.IBM,
                "Timisoara"
        );


        employee1.setName("Jane");

        BankAccount johnsAccount = new BankAccount(

                employee1,

                100000,

                1111);
        System.out.println(johnsAccount);

    }

}
