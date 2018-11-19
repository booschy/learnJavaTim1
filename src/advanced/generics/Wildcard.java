package advanced.generics;

import advanced.abstractClass.Car;
import advanced.abstractClass.VehicleAbstract;

public class Wildcard {


    //private static <T, U> void printItemInside(
      //      BoxGeneric<T, U> genericBox)

    private static void printItemInside(
            BoxGeneric<? extends VehicleAbstract, ?> genericBox) {

        System.out.println(genericBox.getItem());
        System.out.println(genericBox.getItem2());
    }


    public static void main(String[] args) {

        BoxGeneric<Car, String> myBox = new BoxGeneric<>(
                new Car(100, "ford", false),
                "second string");

        printItemInside(myBox);
    }
}
