package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchTheOccurence {

    public String[] getOccurrencePositions(String Match, String Search) {
        if (Match.isEmpty() || Match.isBlank() || Search.isEmpty() || Search.isBlank()) {
            throw new RuntimeException();
        }
        Pattern pattern = Pattern.compile(Search);
        Matcher matcher = pattern.matcher(Match);
        if (matcher.find()) {
            List<String> occurrences = new ArrayList<>();
            occurrences.add(matcher.start() + "-" + matcher.end());
            while (matcher.find()) {
                occurrences.add(matcher.start() + "-" + matcher.end());
            }
            return occurrences.toArray(new String[occurrences.size()]);
        }
        return null;
    }
}
