package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MatchRegex {

    public boolean findPattern(String Match) {
        if (Match.isBlank() || Match.isEmpty()) {
            throw new RuntimeException();
        }
        Pattern pattern = Pattern.compile("(\\s?)(?i)harry\\1");
        Matcher matcher = pattern.matcher(Match);
        return matcher.find();
    }
}
