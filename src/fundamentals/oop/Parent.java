package fundamentals.oop;

public class Parent {  // extends Object

    private String name;

    private int age;

    // constructor
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }


/*
    // deafault constructor
    public Parent() {
        super(); // new Object()
    }
*/


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    @Override
    // from Object
    public String toString(){

        return String.format(
                "Name: %s - Age: %s",
                name,
                age);
    }

}
