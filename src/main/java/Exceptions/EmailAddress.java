package Exceptions;

public class EmailAddress {
    private String eMail;

    public EmailAddress(String eMail){
            if(eMail.contains("@")) {
                this.eMail = eMail;
            }
            else {
                throw new IllegalEmailException("Email must contain an @.");
            }
    }

    @Override
    public String toString() {
        return "EmailAddress{" +
                "eMail='" + eMail + '\'' +
                '}';
    }
}
