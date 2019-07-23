package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;

public class CharacterReplacementTest {

    CharacterReplacement characterReplacement;

    @Before
    public void setUp() throws Exception {
        characterReplacement = new CharacterReplacement();
    }

    @After
    public void tearDown() throws Exception {
        characterReplacement = null;
    }

    /**
     * Test - replaceCharacter()
     * Given empty string as input, check if the method return an error message or not.
     */
    @Test
    public void givenEmptyStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check replaceCharacters()",
                expectedMessage, characterReplacement.replaceCharacters(""));
    }

    /**
     * Test - replaceCharacter()
     * Given blank string as input, check if the method return an error message or not.
     */
    @Test
    public void givenBlankStringShouldReturnErrorMessage() {
        String expectedMessage = "Please enter a valid string. Null or empty string given.";
        assertEquals("givenNullShouldReturnErrorMessage: check replaceCharacters()",
                expectedMessage, characterReplacement.replaceCharacters("  "));
    }


    /**
     * Test - replaceCharacter()
     * Given null as input, check if the method throws a NullPointerException or not.
     */
    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        characterReplacement.replaceCharacters(null);
    }

    /**
     * Test - replaceCharacters()
     * Given a string with capital and small d and i, the method should return valid output.
     */
    @Test
    public void givenStringWithCapitalsShouldReturnStringWithReplacedDAndICharacters() {
        String expectedMessage = "faTly fry";
        assertEquals("givenStringWithCapitalsShouldReturnStringWithReplacedDAndICharacters: check replaceCharacters()",
                expectedMessage, characterReplacement.replaceCharacters("daIly dry"));
    }

    /**
     * Test - replaceCharacters()
     * Given a String without any d or i characters in it, the method should return
     * the same string without any changes.
     */
    @Test
    public void givenStringWithoutDAndIShouldReturnSameString() {
        String expectedMessage = "Hello Java.";
        assertEquals("givenStringWithoutDAndIShouldReturnSameString: check replaceCharacters()",
                expectedMessage, characterReplacement.replaceCharacters(expectedMessage));
    }

    /**
     * Test - replaceCharacters()
     * Given a string with d and i characters, the method should return valid output.
     */
    @Test
    public void givenStringShouldReturnStringWithReplacedDAndICharacters() {
        String expectedMessage = "fatly fry";
        assertEquals("givenStringWithoutDAndIShouldReturnSameString: check replaceCharacters()",
                expectedMessage, characterReplacement.replaceCharacters("daily dry"));
    }

}