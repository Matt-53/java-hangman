package pl.edu.agh.hangman;

import java.util.List;

public class CheckLettersInWord {
    public static boolean checkLettersInWord(String givenWord, String givenLetter, List<String> underscoreList) {
        int wordLength = givenWord.length();
        boolean correctLetter = false;

        for (int i = 0; i < wordLength; i++) {
            String letter = String.valueOf(givenWord.charAt(i));

            if (givenLetter.equals(letter)) {
                underscoreList.set(i,letter);
                correctLetter = true;
            }
        }
        System.out.println(underscoreList);
        System.out.println(correctLetter);

        return correctLetter;
    }
}
