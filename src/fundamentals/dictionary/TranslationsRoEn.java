package fundamentals.dictionary;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static fundamentals.bank.ResourceDirectories.*;
import static fundamentals.dictionary.Translations.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.FileUtils.fileLinesToList;


public class TranslationsRoEn {

    private static Map<String, String> roToEnDictionary;
    private static Map<String, String> enToRoDictionary;


    @BeforeAll
    public static void create_dictionaries_from_files() throws IOException {

        // Step 1 - read from file to Java data structures - deserialize
        List<String> englishLines = getEnglishLines();
        List<String> romanianLines = getRomanianLines();


        // Step 2 - process data - get words map (wordId = word)
        Map<Integer, String> englishWordsMap = getWordsMap(englishLines);
        Map<Integer, String> romanianWordsMap = getWordsMap(romanianLines);

        // Check words count before going further
        assertEquals(
                englishWordsMap.size(),
                romanianWordsMap.size());


        // Step 3.1 - get En to Ro dictionary (englishWord = romanianWord)
        enToRoDictionary = getDictionary(
                englishWordsMap,
                romanianWordsMap);


        // Step 3.2 - get En to Ro dictionary (englishWord = romanianWord)
        roToEnDictionary = getDictionary(
                romanianWordsMap,
                englishWordsMap);
    }


    @Test
    public void en_to_ro_translation_test() {

        String englishText = "boy car doll";
        String expectedRomanianText = "baiat masina papusa";
        System.out.println("English: " + englishText);

        String romanianText = translateText(
                englishText,
                enToRoDictionary).trim();

        System.out.println("Romanian: " + romanianText);

        assertEquals(expectedRomanianText, romanianText);
    }


    @Test
    public void ro_to_en_translation_test() {

        String romanianText = "pana caracatita provocare";
        String expectedEnglishText = "feather octopus challenge";
        System.out.println("Romanian: " + romanianText);


        String englishText = translateText(
                romanianText,
                roToEnDictionary).trim();

        System.out.println("English: " + englishText);

        assertEquals(expectedEnglishText, englishText);
    }


    private static List<String> getRomanianLines() throws IOException {

        return fileLinesToList(
                Resource.name(),
                Fundamentals.name(),
                Dictionary.name(),
                "romanian_words.txt"
        );
    }


    private static List<String> getEnglishLines() throws IOException {

        return fileLinesToList(
                Resource.name(),
                Fundamentals.name(),
                Dictionary.name(),
                "english_words.txt"
        );
    }


    public static void main(String[] args) throws IOException {

        create_dictionaries_from_files();

        String text = "";

        for (int i = 0; i < args.length; i++) {
            text += args[i] + " ";
        }
        // remove last space
        text = text.trim();

        String translatedText;
        if(enToRoDictionary.keySet().contains(args[1])){
            translatedText = translateText(text, enToRoDictionary);
        }
        else{
            translatedText = translateText(text, roToEnDictionary);
        }

        System.out.println(translatedText);
    }
}
