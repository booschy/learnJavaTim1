package advanced.lambda;


// Functional Interface - only one abstract method (with no body)
public interface Operation<T> {

    // only ONE
    public T operate(T first, T last);

    static void info(){
        System.out.println(Operation.class.getName());
    }
}
