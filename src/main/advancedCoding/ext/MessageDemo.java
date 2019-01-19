package main.advancedCoding.ext;

import messages.Message;
import messages.Test;

public class MessageDemo {


    public static void main(String[] args) {
        Message message = new Message();

        message.info("This is is test.");
        message.warning("Be carefull of this test!");
        message.error("Error in test!!!");

        Test.main();
    }


}
