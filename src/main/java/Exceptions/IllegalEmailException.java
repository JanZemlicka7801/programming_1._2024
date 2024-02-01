package Exceptions;

public class IllegalEmailException extends IllegalArgumentException{

    private String eMail;
    public IllegalEmailException(String eMail){
        super(eMail);
    }
}
