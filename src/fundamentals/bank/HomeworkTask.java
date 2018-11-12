package fundamentals.bank;


/*

Using user.dir/BankResources/Homework/timisoara_employees.txt,

create an output file user.dir/BankResources/Homework/timisoara_employees_statistics.txt

that will contain the following text:


"Timisoara IT companies employee statistics:

Consignor: 7

IBM: 4

Azets: 6

Visma: 5

Unknown: 0"


TIPS:

You can find useful info in bank.Person class.
You can reuse any already created code.

Step1 - deserialize file to a list of Persons; be careful of the multiple separators

Step2 - create a function that has the Employer as a parameter and returns the employees count

Step3 - get statistics and write them to the output file.


GOOD LUCK!

*/


import java.util.Arrays;


public class HomeworkTask {


    public static void main(String[] args) {
        String text = "dog,cat,mouse";

        String[] textTokens = text.split(",");
        System.out.println(Arrays.toString(textTokens));
        // implement flow here
        // put any additional functions also in this class
    }

}
