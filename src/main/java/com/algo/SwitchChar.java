package com.algo;

import java.util.LinkedHashSet;

public class SwitchChar {

    // Method to remove duplicate from string
    private static String removeDup (String word) {
        LinkedHashSet<Character> dupChar = new LinkedHashSet<>();

        String cleanString = "";

        for (int i = 0; i < word.length(); i++)
            dupChar.add(word.charAt(i));

        for (Character ch :dupChar)
            cleanString += String.valueOf(ch);

        return cleanString;
    }

    // Method to check if the characters in inputChar are contained in actualChar
    private static boolean existsIn (String child, String parent) {
        for (int i = 0; i < child.length(); i++){
            if (!parent.contains(String.valueOf(child.charAt(i))))
                return false;
        }

        return true;
    }

    public static String switchChar (String inputChar, String actualChar, String changeChar){
        // Returns error msg when actualChar length and changeChar length are not same
        if (actualChar.length() != changeChar.length()) return "Length mismatch";

        // Remove duplicates from String
        String noDup = removeDup(actualChar);

        // Returns error msg when characters in actualChar are repeated
        if (!noDup.equals(actualChar))
            return "Repeated value";

        // Returns error msg when the length of inputChar is longer than the length of actualChar
        if (inputChar.length() > actualChar.length())
            return "-1";

        // Returns error msg when the characters in inputChar are not contained in actualChar
        if (!existsIn(inputChar, actualChar))
            return  "-1";

        // Create new value to hold the changed word
        String newWord = "";

        // Iterate over inputChar to get each character
        for (int i = 0; i < inputChar.length(); i++){

            // Get index of the current character being iterated over (index of the character in actualChar)
            int currentCharIndex = actualChar.indexOf(inputChar.charAt(i));

            // Get new character from changeChar with index gotten
            char changedCurrentChar = changeChar.charAt(currentCharIndex);

            // Concatenate the changed character to the newWord value
            newWord += String.valueOf(changedCurrentChar);
        }

        // ✨ ✨ ✨
        return newWord;
    }
}
