package Exceptions;

public class Fraction {
    private final Integer num;
    private final Integer den;

    public Fraction(Integer num, Integer den) throws NullDenException {
        if(den != null){
            this.den = den;
        } else {
            throw new NullDenException("Den cant be null.");
        }
        this.num = num;
    }


}
