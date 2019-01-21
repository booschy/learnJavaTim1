package main.advanced.abstractClass;

public interface Stopable {

    String MESSAGE = "STOPPED!";


    // 1. abstract method; need implementation
    void stop(int secondsDelay);


    // 2. default - has body
    default String getInfo(){
        return "car info";
    }


    // 3. static
    static String getDefaultInfo(){
        return "car default info (static)";
    }
}
