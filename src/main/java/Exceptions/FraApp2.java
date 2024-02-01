package Exceptions;

public class FraApp2 {
    public static void main(String[] args) {
        try {
            Fraction f = new Fraction(2, 5);
        } catch (NullDenException e){
            System.out.println(e.getMessage());
        }
    }
}
