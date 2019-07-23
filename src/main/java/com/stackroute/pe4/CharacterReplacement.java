package com.stackroute.pe4;

import java.util.regex.Pattern;


public class CharacterReplacement {


    public String replaceCharacters(String inputString) {
        if (inputString.isEmpty() || inputString.isBlank()) {
            return "Please enter a valid string. Null or empty string given.";
        }
//        First replace all "d" with "f"
        String replaceCharactersString = inputString.replaceAll("d", "f");
        replaceCharactersString = replaceCharactersString.replaceAll("D", "F");
//        Replace all "i" with "t"
        replaceCharactersString = replaceCharactersString.replaceAll("i", "t");
        replaceCharactersString = replaceCharactersString.replaceAll("I", "T");
        return replaceCharactersString;
    }
}
