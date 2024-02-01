package Exceptions;

public class IllegalWordException extends Exception{
    private String Message;
    public IllegalWordException(String Message){
        super(Message);
    }
}
