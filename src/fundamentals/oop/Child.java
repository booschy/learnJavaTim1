package fundamentals.oop;

public class Child

        extends Parent

        implements Learnable{

    // fields
    private String schoolName;

    // constructor
    public Child(
            String name,
            int age,
            String schoolName) {

        // parent constructor
        super(name, age);

        this.schoolName = schoolName;
    }


    // other methods
    public String getSchoolName() {
        return schoolName;
    }


    @Override
    // from Parent
    public String toString(){

        return super.toString()
                + " - School: " + schoolName;
    }


    @Override
    // from Learnable
    public void learn() {

        System.out.println("learning ...");
    }
}
