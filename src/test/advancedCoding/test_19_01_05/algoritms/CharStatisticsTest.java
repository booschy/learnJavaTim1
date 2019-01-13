package test.advancedCoding.test_19_01_05.algoritms;

import main.advancedCoding.algoritms.CharStatistics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class CharStatisticsTest {

    String text1;
    String text2;
    String emptyText;
    CharStatistics charStatistics1;
    CharStatistics charStatistics2;
    CharStatistics emptyStatitstics;

    @BeforeEach
    public void beforeEach(){
        text1 = "geeks for geeks121";
        text2 = " A1 B@ d adc";
        emptyText = "";

        charStatistics1 = new CharStatistics(text1);
        charStatistics2 = new CharStatistics(text2);
        emptyStatitstics = new CharStatistics(emptyText);
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

    @Test
    public void uppercase_letter_test1(){
        Assertions.assertEquals(0,
                charStatistics1.getStatstics().getUppercase());
    }

    @Test
    public void uppercase_letter_test2(){
        Assertions.assertEquals(2,
                charStatistics2.getStatstics().getUppercase());
    }

    @Test
    public void lowercase_letter_test1(){
        Assertions.assertEquals(13,
                charStatistics1.getStatstics().getLowercase());
    }

    @Test
    public void lowercase_letter_test2(){
        Assertions.assertEquals(4,
                charStatistics2.getStatstics().getLowercase());
    }

    @Test
    public void vowel_letter_test1(){
        Assertions.assertEquals(5,
                charStatistics1.getStatstics().getVowel());
    }

    @Test
    public void vowel_letter_test2(){
        Assertions.assertEquals(2,
                charStatistics2.getStatstics().getVowel());
    }

    @Test
    public void consonant_letter_test1(){
        Assertions.assertEquals(8,
                charStatistics1.getStatstics().getConsonant());
    }

    @Test
    public void consonant_letter_test2(){
        Assertions.assertEquals(4,
                charStatistics2.getStatstics().getConsonant());
    }

    @Test
    public void digit_letter_test1(){
        Assertions.assertEquals(3,
                charStatistics1.getStatstics().getDigit());
    }

    @Test
    public void digit_letter_test2(){
        Assertions.assertEquals(1,
                charStatistics2.getStatstics().getDigit());
    }


    @Test
    public void specialChar_letter_test1(){
        Assertions.assertEquals(2,
                charStatistics1.getStatstics().getSpecialCharacter());
    }

    @Test
    public void specialChar_letter_test2(){
        Assertions.assertEquals(5,
                charStatistics2.getStatstics().getSpecialCharacter());
    }

    @Test
    public void empty_text_test(){

        /*Function<CharStatistics, Integer> getCounter =

                charStatistics ->*/

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getLetter());

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getLowercase());

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getUppercase());

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getVowel());

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getConsonant());

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getDigit());

        Assertions.assertEquals(0,
                emptyStatitstics.getStatstics().getSpecialCharacter());
    }

}
