package main.advancedCoding.test_19_01_12;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;

public class CarTest {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Audi A6", 240),
                new Car("Ford Fiesta", 160),
                new Car("Porsche 911", 290),
                new Car("Dacia Duster", 18),
                new Car("Dacia Sandero", 18),
                new Car("Volkswagen Beetle", 30));

        System.out.println(cars);


        //a.
        final Function<Car, String> carToName = car -> car.getName();
        List<String> allNames = cars.stream()
                .map(carToName)
                .collect(toList());

        System.out.println("All names: " + allNames);


        //b.
        final Predicate<Car> isDaciaModel = Car -> Car.getName().startsWith("Dacia");
        Long daciaModelsCount = cars.stream()
                .filter(isDaciaModel)
                .count();
        System.out.println("Dacia models count: " + daciaModelsCount);


        //c.
        final Predicate<Car> fasterThan200 = car -> car.getSpeed() > 200;
        final Predicate<Car> slowerThan300 = car -> car.getSpeed() <= 300;
        List<String> cars200To300 = cars.stream()
                .filter(fasterThan200.and(slowerThan300))
                .map(carToName)
                .collect(toList());

        System.out.println("Cars with speed form 200 to 300: " + cars200To300);


        //d.
        Supplier<Car> carSupplier = () -> new Car("Ferarri", 320);
        System.out.println("Car supplier test: " + carSupplier.get());


        //e.
        final Consumer<Car> CarConsumer = Car -> System.out.println(Car);
        System.out.println("Car consumer test:");
        cars.forEach(CarConsumer);
        //cars.forEach(System.out::println);
    }

}