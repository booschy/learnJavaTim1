package test.extJarTest;

import info.Warning;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagesTest {

    @Test
    public void test(){

        String warning = new Warning().message();

        System.out.println(warning);

        Assertions.assertEquals(
                "Warning from info.Warning",
                warning);
    }
}
