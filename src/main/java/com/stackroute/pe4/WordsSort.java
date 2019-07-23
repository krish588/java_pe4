package com.stackroute.pe4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class WordsSort {

    public String[] sortWordsInParagraph(String paragraphToSort) {
        if (paragraphToSort.isEmpty() || paragraphToSort.isBlank()) {
            throw new NullPointerException();
        }
        List<String> wordsList = Arrays.asList(paragraphToSort.split(" "));
        Collections.sort(wordsList, String.CASE_INSENSITIVE_ORDER);
        return wordsList.toArray(new String[wordsList.size()]);
    }
}
