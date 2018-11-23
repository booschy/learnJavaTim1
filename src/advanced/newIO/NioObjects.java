package advanced.newIO;

import fundamentals.dictionary.Translations;
import utils.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class NioObjects {


    final String wordsFileLanguageFrom = "Resource/Fundamentals/Dictionary/romanian_words.txt";
    final String wordsFileLanguageTo = "Resource/Fundamentals/Dictionary/english_words.txt";

    final String roEnDictionaryFile = "Resource/Advanced/NewIO/roEnDictionary.map";


    Map<String, String> roEnDictionary;


    @BeforeEach
    public void create_dictionaries_from_files() throws Exception {

        roEnDictionary = Translations.getDictionary(
                wordsFileLanguageFrom,
                wordsFileLanguageTo);
/*
        roEnDictionary = FileUtils.read(
                FileUtils.getLocalPath(roEnDictionaryFile),
                new TreeMap<>()
        );*/

    }


    @Test
    public void test() throws Exception {

        System.out.println(roEnDictionary);

        //roEnDictionary.put("zebra", "zebra");

        FileUtils.write(
                FileUtils.getLocalPath(roEnDictionaryFile),
                roEnDictionary);
    }
}

