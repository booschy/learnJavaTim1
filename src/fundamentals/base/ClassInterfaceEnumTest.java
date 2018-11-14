package fundamentals.base;

// also can use class/interface
public enum ClassInterfaceEnumTest {

    one,
    two;


    public static void main(String[] args) {

        for(ClassInterfaceEnumTest enumValue : values()){

            System.out.println(enumValue);
        }
    }
}
