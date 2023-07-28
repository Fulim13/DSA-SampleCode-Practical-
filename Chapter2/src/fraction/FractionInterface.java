package fraction;

public interface FractionInterface {

    void setNumerator(int numerator);

    void setDenominator(int denominator);

    int getNumerator();

    int getDenominator();

    FractionInterface add(FractionInterface f);

    FractionInterface subtract(FractionInterface f);

    FractionInterface multiply(FractionInterface f);

    FractionInterface divide(FractionInterface f);
}
