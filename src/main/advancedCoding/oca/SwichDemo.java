package main.advancedCoding.oca;

import org.junit.jupiter.api.Test;

public class SwichDemo {


    @Test
    public void switch_wrong_test(){

        int i = 9;

        switch (i){

            default:
                System.out.println("error");
                break;

            case 1: System.out.println(1);
            case 2: System.out.println(2);
            case 5: System.out.println(5);
            case 6: System.out.println(6);
            case 7: System.out.println(7);
        }
    }


    @Test
    public void switch_best_practice_test(){

        System.out.println(switchMethod(9));
    }


    private int switchMethod(int i) {

        switch (i){

            case 1: return 1;

            default:
                return 1111;

            case 2:
            case 3:
            case 4:
                return 234;

            case 5: return 5;
            case 6: return 6;
            case 7: return 6;
        }
    }
}
