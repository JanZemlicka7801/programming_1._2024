package Exceptions;

public class WordApp {
    public static void main(String[] args) {
        try {
            BWords b = new BWords();
            b.add("damn");
        } catch (IllegalWordException e){
            System.out.println(e.getMessage());
        }
    }
}
