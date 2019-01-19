package main.advancedCoding.tddReloaded;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.advancedCoding.tddReloaded.Label.*;

/*
score < 20: ROOKIE
20 <= score > 50: BEGINNER
50 <= score < 70: MIDDLE
70 <= score < 80: ADVANCED
80 <= score < 90: SENIOR
90 >= score: GURU

...0...20...50...70...80...90...100...
 */
public class ScoreLabel {

    public Label getLabel(int score){

        if(score < 0){
            throw new Error("wrong negative scoring");
        }

        if(20 > score){
            return ROOKIE;
        }

        if(20 <= score && score < 50){
            return BEGINNER;
        }

        if(50 <= score && score < 70){
            return MIDDLE;
        }

        // homework - ADVANCED, SENIOR - TDD

        if(90 <= score && score <= 100){
            return GURU;
        }


        if(100 < score){
            throw new Error("too much!");
        }

        return NO_LABEL;
    }

    @Test
    public void rookie_wrong_lower_value_limit_test(){

        Assertions.assertThrows(
                Error.class,
                () -> getLabel(-5)
        );
    }


    @Test
    public void rookie_lower_limit_test(){
        Assertions.assertEquals(
                ROOKIE,
                getLabel(0)
        );
    }


    @Test
    public void rookie_interval_test(){
        Assertions.assertEquals(
                ROOKIE,
                getLabel(19)
        );
    }


    @Test
    public void beginner_lower_limit_test(){
        Assertions.assertEquals(
                BEGINNER,
                getLabel(20)
        );
    }


    @Test
    public void beginner_interval_test(){
        Assertions.assertEquals(
                BEGINNER,
                getLabel(40)
        );
    }


    @Test
    public void middle_lower_limit_test(){
        Assertions.assertEquals(
                MIDDLE,
                getLabel(50)
        );
    }


    @Test
    public void middle_interval_test(){
        Assertions.assertEquals(
                MIDDLE,
                getLabel(65)
        );
    }


    // homework - ADVANCED, SENIOR - TDD


    @Test
    public void guru_lower_limit_test(){

        Assertions.assertEquals(
                GURU,
                getLabel(90)
        );
    }


    @Test
    public void guru_interval_test(){

        Assertions.assertEquals(
                GURU,
                getLabel(95)
        );
    }


    @Test
    public void rookie_wrong_upper_value_limit_test(){

        Assertions.assertThrows(
                Error.class,
                () -> getLabel(101)
        );
    }
}
