package main.advancedCoding.algoritms;

public class Statistics {
    int letter;
    int vowel;
    int consonant;
    int uppercase;
    int lowercase;
    int digit;
    int specialCharacter;

    public int getLetter() {
        return letter;
    }

    public int getVowel() {
        return vowel;
    }

    public int getConsonant() {
        return consonant;
    }

    public int getUppercase() {
        return uppercase;
    }

    public int getLowercase() {
        return lowercase;
    }

    public int getDigit() {
        return digit;
    }

    public int getSpecialCharacter() {
        return specialCharacter;
    }

    public Statistics(
            int letter,
            int vowel,
            int consonant,
            int uppercase,
            int lowercase,
            int digit,
            int specialCharacter) {

        this.letter = letter;
        this.vowel = vowel;
        this.consonant = consonant;
        this.uppercase = uppercase;
        this.lowercase = lowercase;
        this.digit = digit;
        this.specialCharacter = specialCharacter;
    }

    @Override
    /* toString() output:
    Letters: 6
    Vowels: 2
    Consonant: 4
    Uppercase: 2
    Lowercase: 4
    Digit: 1
    Special Character: 6
    */
    public String toString() {
        return "Statistics{" +
                "letter=" + letter +
                ", vowel=" + vowel +
                ", consonant=" + consonant +
                ", uppercase=" + uppercase +
                ", lowercase=" + lowercase +
                ", digit=" + digit +
                ", specialCharacter=" + specialCharacter +
                '}';
    }
}
