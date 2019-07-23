package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsSortTest {
    WordsSort wordsSort;
    @Before
    public void setUp() throws Exception {
        wordsSort = new WordsSort();
    }

    @After
    public void tearDown() throws Exception {
        wordsSort = null;
    }

    /**
     * Test - sortWordsInParagraph()
     * Given a string input, the method should return an array of strings sorted
     * alphabetically.
     */
    @Test
    public void givenInputShouldReturnArrayOfSortedWords() {
        String[] expectedOutput = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f"
        };
        assertArrayEquals("givenInputShouldReturnArrayOfSortedWords: check sortWordsInParagraph(). Should return an array of sorted words.",
                expectedOutput, wordsSort.sortWordsInParagraph("f e d c b a"));
    }

    /**
     * Test - sortWordsInParagraph()
     * Given null string to count occurrences, the method should throw a
     * NullPointerException.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullStringShouldThrowNullPointerException() {
        wordsSort.sortWordsInParagraph(null);
    }

    /**
     * Test - sortWordsInParagraph()
     * Given a Empty string, method should throw a Null Pointer Exception.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringShouldThrowNullPointerException() {
        wordsSort.sortWordsInParagraph("");
    }

    /**
     * Test - sortWordsInParagraph()
     * Check if the method throws NullPointerException when blank strings are given.
     */
    @Test(expected = NullPointerException.class)
    public void givenEmptyStringsShouldThrowNullPointerExceptions() {
        wordsSort.sortWordsInParagraph("   ");
    }

}