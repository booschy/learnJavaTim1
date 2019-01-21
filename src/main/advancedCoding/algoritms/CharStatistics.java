package main.advancedCoding.algoritms;


import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CharStatistics {

    private String text;
    private Statistics statstics;


    private final List<Character> VOWELS = List.of(
            'a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U');


    public CharStatistics(String text) {
        this.text = text;
    }


    public Statistics getStatstics() {

        return new Statistics(
                getLetterStatistics(),
                getVowelStatistics(),
                getConsonantStatistics(),
                getUpperCaseStatistics(),
                getLowerCaseStatistics(),
                getDigitStatistics(),
                getSpecialCharacterStatistics());
    }


    // common algorithm for all counters
    // this method can be changed with getLetterCountForCondition
    private int getLetterCountForCondition_classic(Predicate<Character> letterCondition) {

        int letterCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if(letterCondition.test(currentCharacter)){
                letterCount++;
            }
        }
        return letterCount;
    }


    private int getLetterCountForCondition(Predicate<Character> letterCondition) {

        /*
        // Step by step stream solution:
        IntStream charIntStream = text.chars();

        Stream<Character> characterStream = charIntStream.mapToObj(
                intCharacter -> Character.valueOf((char) intCharacter)
        );

        Stream<Character> filteredByLetterConditionStream =
                characterStream.filter(letterCondition);

        long count = filteredByLetterConditionStream.count();

        int intCount = (int)count;

        return intCount;*/

        long counter = text.chars()
                .mapToObj(intToCharacter)
                .filter(letterCondition)
                .count();

        return (int)counter;
    }


    private IntFunction<Character> intToCharacter =
        intCharacter -> Character.valueOf((char)intCharacter);


    private int getSpecialCharacterStatistics() {
        return getLetterCountForCondition(character -> isSpecialChar(character));
    }


    private int getDigitStatistics() {
        return getLetterCountForCondition(this::isDigit);
    }


    private int getUpperCaseStatistics() {

        return getLetterCountForCondition(this::isUppercaseLetter);
    }


    private int getLowerCaseStatistics() {

        return getLetterCountForCondition(this::isLowercaseLetter);
    }


    private int getConsonantStatistics() {
        return getLetterCountForCondition(this::isConsonant);
    }


    private int getVowelStatistics() {

        return getLetterCountForCondition(this::isVowel);
    }


    private int getLetterStatistics() {

        /*return getLetterCountForCondition(
                character -> isLowercaseLetter(character)
                        || isUppercaseLetter(character));*/

      return getLetterCountForCondition(character -> isLetter(character));
    }


    // letter conditions
    private boolean isLetter(char character){
        return isLowercaseLetter(character) || isUppercaseLetter(character);

    }


    private boolean isLowercaseLetter(char character) {
        return character >= 'a' && character <= 'z';
    }


    private boolean isUppercaseLetter(char character) {
        return character >= 'A' && character <= 'Z';
    }


    private boolean isVowel(char character){
        return VOWELS.contains(character);
    }


    private boolean isConsonant(char character){
        final boolean isNotVowel = false == VOWELS.contains(character);

        return isLetter(character) && isNotVowel;
    }


    private boolean isDigit(char character){
        return '0' <= character && character <='9';
    }


    private boolean isSpecialChar(char character){
        final boolean isNotLetter = ! isLetter(character);
        final boolean isNotDigit = false == isDigit(character);

        return isNotLetter && isNotDigit;
    }
}
