package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.List;

public class SampleGivenWord {
    public static List<String> sampleGivenWord(String givenWord, String givenLetter) {
        int wordLength = givenWord.length();
        List<String> underscoreList = new ArrayList();

        for (int i = 0; i < wordLength; i++) {
            underscoreList.add("_");
        }
        System.out.println(underscoreList);
        return underscoreList;
    }
}
