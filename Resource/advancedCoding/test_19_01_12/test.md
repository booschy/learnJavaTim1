## Individual white paper test

1. Which of the following are true in Java?

    a. In case of method overriding, signature of method changes.

    b. You can overload static, final and private methods.

    c. You can override static, final and private methods.

    d. In case of method overloading, signature of method changes.

    e. You can only override methods in a subclass.

    f. You can access private members directly in any subclass.

   #### 15 POINTS


2. What will the following code print?

    ```
    int[] numbers = new int[]{1, 2, 3};
    int firstIndex = 1;
    int secondIndex = 2;
    System.out.println(numbers[firstIndex++]+ numbers[++secondIndex]);
    ```

    a. 0

    b. 5

    c. 4

    d. 6

    e. throws ArrayIndexOutOfBoundsException

    f. 3

   #### 10 POINTS


3. What will be printed to console after running the Test class?

    ```
    interface Vehicle{
        public default void message(){ System.out.print("vehicle"); }
    }

    class Car implements Vehicle{
        public void message(){ System.out.print("car"); }
    }

    class Audi extends Car{
        public void message(){System.out.print("audi"); }
    }

    class Test{
        public static void main(String[] args) {
            Vehicle vehicle = new Vehicle();
            vehicle.message();
        }
    }
    ```

    a. the code will not compile

    b. car

    c. audi

    d. vehiclecaraudi

    e. the code will throw a RuntimeException

    f. vehicle

   #### 10 POINTS


4. Which of the following methods can appear in an interface?

    a.   public default void MESSAGE();

    b.   private void MESSAGE(){ System.out.println("MESSAGE"); };

    c.   public static void MESSAGE();

    d.   private static String MESSAGE(){ return "MESSAGE"; }

    e.   public default String MESSAGE(){ System.out.println("MESSAGE"); }

    f.   all above

   #### 10 POINTS

5. Streams test: having the following classes:

    ```
    public class Car {
        private String name;
        private int speed;

        public Car(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        @Override
        public String toString() {
            return name + " : " + speed + " km/h";
        }
    }

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

            // implementation here
    ```

    resolve the following tasks in CarTest.main:

    a. Map the cars list to a car names list.

    b. Filter Dacia models from the cars list, then count them.

    c. Filter the cars list to get cars with speed
    between 200 exclusive and 300 km/h inclusive,
    then create a list of their names.

    d. Write a Car supplier function.
    Print what it supplies.

    e. Write a Car consumer that only prints the Car,
    then consume the initial cars list with it.

   #### 55 POINTS


## TOTAL 100 POINTS

## GOOD LUCK!
