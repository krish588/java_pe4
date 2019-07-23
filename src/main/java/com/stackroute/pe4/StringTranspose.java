package com.stackroute.pe4;


public class StringTranspose {

    public String transposeWordsInString(String input) {
        if (input.isEmpty() || input.isBlank()) {
            return "Please enter a valid string. Null or empty string given.";
        }
        String[] transArray = input.split("\\s");
        StringBuilder stringTranspose = new StringBuilder();
        for (String trans : transArray) {
            stringTranspose.append(
                    new StringBuilder(trans).reverse() + " "
            );
        }
        return stringTranspose.toString().trim();
    }
}
