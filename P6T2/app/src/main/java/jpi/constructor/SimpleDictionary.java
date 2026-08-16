package jpi.constructor;

import java.util.ArrayList;

public class SimpleDictionary {

    private ArrayList<String> wordEnglish;
    private ArrayList<String> wordJapanese;

    public SimpleDictionary() {
        this.wordEnglish = new ArrayList<>();
        this.wordJapanese = new ArrayList<>();
    }

    public void add(String one, String two) {
        this.wordEnglish.add(one);
        this.wordJapanese.add(two);
    }

    public String translate(String wordToTranslate) {
        int index = 0;
        for (String word : wordEnglish) {
            if (wordToTranslate.equals(word)) {
                index = wordEnglish.indexOf(word);
                return wordJapanese.get(index);
            }
        }

        return "Word was not found";
    }
}
