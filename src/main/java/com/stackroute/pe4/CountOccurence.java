package com.stackroute.pe4;


public class CountOccurence {

    public long countOccurrences(String ToCount, String stringToCount) {
        if (ToCount.isEmpty() || stringToCount.isEmpty() || ToCount.isBlank() || stringToCount.isBlank() || ToCount.equals(null) || stringToCount.equals(null)) {
            throw new NullPointerException();
        }
        Character characterToCount = ToCount.toCharArray()[0];
        return stringToCount.chars().filter(characterInString -> characterInString == characterToCount).count();
    }
}
