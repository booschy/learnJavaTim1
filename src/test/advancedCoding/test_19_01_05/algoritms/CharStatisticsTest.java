package test.advancedCoding.test_19_01_05.algoritms;

import main.advancedCoding.algoritms.CharStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CharStatisticsTest {

    String text1;
    String text2;
    CharStatistics charStatistics1;
    CharStatistics charStatistics2;

    @BeforeEach
    public void beforeEach(){
        text1 = "geeks for geeks121";
        text2 = " A1 B@ d adc";
        charStatistics1 =  new CharStatistics(text1);
        charStatistics2 =  new CharStatistics(text2);
    }

    @Test
    public void letter_test1(){
        Assertions.assertEquals(13,
                charStatistics1.getStatstics().getLetter());
    }

    @Test
    public void letter_test2(){
        Assertions.assertEquals(6,
                charStatistics2.getStatstics().getLetter());
    }

}
