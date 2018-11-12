package fundamentals.bank;

import java.util.Arrays;

public class RegexTest {

    public static void main(String[] args) {

        String empty = "";

        String animals = "cat , dogx rabbit   -  mouse";

        String template = "Hello user @userName. You won 100 dolars.";


        // matches

        // any char * any number of times, including 0
        System.out.println(empty.matches(".*"));
        // any char * one or more times
        System.out.println(empty.matches(".+"));

        System.out.println(animals.matches("^cat.*dog.*use$"));


        // split
        System.out.println(Arrays.toString(
                animals.split("\\s*(,|x|-)\\s*")));


        // replace
        System.out.println(
                //"Hello Dan. You won 100 dolars 9."
            template.replaceAll(".*(\\d{3})", "$1")
        );
    }

}
