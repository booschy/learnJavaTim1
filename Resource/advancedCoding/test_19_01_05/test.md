## Individual white paper test

1. Which of the following are true in Java?

    a. You can access private members directly in any subclass.

    b. You can override static, final and private methods.

    c. In case of method overloading, signature of method changes.

    d. You can overload static, final and private methods.

    e. You can only override methods in a sub class.

    f. In case of method overriding, signature of method changes.

#### 15 POINTS


2. What will the following code print?

    ```
    int i = 10;
    Integer j = 5;
    System.out.println(i++ - --j);
    ```

    a. 8

    b. IncompatibleTypeException

    c. 5

    d. 6

    e. 7

    f. 15

#### 10 points


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
            Car car = new Audi();
            car.message();
        }
    }
    ```

    a. the code will not compile

    b. car

    c. audi

    d. vehiclecaraudi

    e. the code will throw a RuntimeException

    f. vehicle

#### 10 points


4. Which of the following methods can appear in an interface?

    a.   private void MESSAGE(){ System.out.println("MESSAGE"); };

    b.   public void MESSAGE(){ System.out.println("MESSAGE"); }

    c.   public default void MESSAGE();

    d.   public static String MESSAGE(){ return "MESSAGE"; }

    e.   public static void MESSAGE();

    f.   all above

#### 10 points

5. Streams test: having the following classes:

    ```
    public class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() { return name; }

        public int getAge() { return age; }
    }

    public class PersonTest{
        List<Person1> persons = List.of(
            new Person1("Doug", 50),
            new Person1("Diana", 37),
            new Person1("Mark", 29),
            new Person1("Don", 50),
            new Person1("Carmen", 18)
        );
        // implementation here
    }

    ```

    resolve the following tasks in PersonTest.main;

    a. Write a mapper from a person to it's name.
    Create a list of names from the personList.

    b. Write a filter for names starting with "D".
    Count persons with names starting with "D" from the personList.

    c. Write a filter for persons with age between 20 and 30.
    Create a list of names from the personList, for persons
    that match the above condition.

    d. Write a supplier of person.
    Print what it supplies.

    e. Write a consumer of person that only prints the person.
    Use it against persons list.

   #### 55 POINTS


## TOTAL 100 POINTS

## GOOD LUCK!




