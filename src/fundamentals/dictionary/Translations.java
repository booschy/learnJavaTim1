package fundamentals.dictionary;

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
            Map<Integer, String> WordsToTranslateMap,
            Map<Integer, String> TranslatedWordsMap) {

        Map<String, String> dictionary = new TreeMap<>();

        for(int key : WordsToTranslateMap.keySet()){

            dictionary.put(
                    WordsToTranslateMap.get(key),
                    TranslatedWordsMap.get(key));
        }

        return dictionary;
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

        return wordsMap;
    }

}

