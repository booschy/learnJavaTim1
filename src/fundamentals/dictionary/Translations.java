package fundamentals.dictionary;

import utils.FileUtils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public interface Translations {

    final String wordIdRegex = "\\d+\\s*";  // "11  cat"


    public static String translateText(
            String text,
            Map<String, String> dictionary) {

        String[] words = text.split(" ");
        String translatedText = "";

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];

            translatedText += dictionary.get(currentWord) + " ";
        }

        return translatedText;
    }


    public static Map<String, String> getDictionary(
            Map<Integer, String> WordsToTranslateMap,  // { 1="pisica", 2="baiat" ... }
            Map<Integer, String> TranslatedWordsMap) { // // { 1="cat", 2="boy" ... }

        Map<String, String> dictionary = new TreeMap<>();

        for(int key : WordsToTranslateMap.keySet()){

            dictionary.put(
                    WordsToTranslateMap.get(key),
                    TranslatedWordsMap.get(key));
        }

        return dictionary;   // { "pisica"="cat", "baiat"="boy" ... }
    }


    // line: wordId word
    // 11 cat
    public static Map<Integer, String> getWordsMap(List<String> lines) {

        Map<Integer, String> wordsMap = new TreeMap<>();

        for(String line : lines){

            String word = line.replaceAll(wordIdRegex, "");

            // remove wordId and trim
            String wordId = line
                    .replaceAll(word, "")
                    .trim();

            Integer intWordId = Integer.valueOf(wordId);

            wordsMap.put(intWordId, word);
        }

        return wordsMap;  // { 1="pisica", 2="baiat" ... }
    }


    static Map<String, String> getDictionary(
            String wordsFileLanguageFrom,
            String wordsFileLanguageTo) throws IOException {

        List<String> fileLinesFrom = FileUtils.fileLinesToList(
                Paths.get(wordsFileLanguageFrom));
        // List<String>
        //4 baiat
        //5 masina
        //20 cursa...

        List<String> fileLinesTo = FileUtils.fileLinesToList(
                Paths.get(wordsFileLanguageTo));
        // List<String>
        //17 noun
        //3 boat
        //6 challenge...

        // { 1="pisica", 2="baiat" ... }
        Map<Integer, String> wordMapsFrom = getWordsMap(fileLinesFrom);

        // // { 1="cat", 2="boy" ... }
        Map<Integer, String> wordMapsTo = getWordsMap(fileLinesTo);

        // { "pisica"="cat", "baiat"="boy" ... }
        return getDictionary(wordMapsFrom, wordMapsTo);
    }

}

