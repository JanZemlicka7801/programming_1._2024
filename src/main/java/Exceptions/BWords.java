package Exceptions;

import java.util.ArrayList;

public class BWords {
    private ArrayList<String> beeWords;

    public void add(String word) throws IllegalWordException {
        if(word.toLowerCase().startsWith("b") || word.toLowerCase().endsWith("b")){
            beeWords.add(word);
        } else {
            throw new IllegalWordException("Passed word does not start or end with an b.");
        }
    }
}
