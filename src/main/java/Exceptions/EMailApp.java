package Exceptions;

public class EMailApp {

    public static void main(String[] args) {
        EmailAddress e1 = new EmailAddress("janzemlicka@yahoo.com");
        try {
            EmailAddress e2 = new EmailAddress("lomzem.jzgmail.com");
        } catch (IllegalEmailException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(e1);
    }
}
