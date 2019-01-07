package main.advancedCoding.algoritms;


public class CharStatistics {

    private String text;
    private Statistics statstics;

    public CharStatistics(String text) {
        this.text = text;
    }

    public Statistics getStatstics() {

        return new Statistics(
                getLetterStatistics(),
                getVowelStatistics(),
                getConsonantStatistics(),
                getLowerCaseStatistics(),
                getUpperCaseStatistics(),
                getDigitStatistics(),
                getSpecialCharacterStatistics());
    }

    private int getSpecialCharacterStatistics() {
        return 0;
    }

    private int getDigitStatistics() {
        return 0;
    }

    private int getUpperCaseStatistics() {
        return 0;
    }

    private int getLowerCaseStatistics() {
        return 0;
    }

    private int getConsonantStatistics() {
        return 0;
    }

    private int getVowelStatistics() {

        return 0;
    }

    private int getLetterStatistics() {

        int letterCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);
            if(isLetter(currentCharacter)){
                letterCount++;
            }
        }

        return letterCount;
    }

    private boolean isLetter(char character){
        return isLowercaseLetter(character) || isUppercaseLetter(character);

    }

    private boolean isLowercaseLetter(char character) {
        return character >= 'a' && character <= 'z';
    }

    private boolean isUppercaseLetter(char character) {
        return character >= 'A' && character <= 'Z';
    }


}
