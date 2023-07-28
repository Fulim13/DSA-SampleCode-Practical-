package fraction;

public class Fraction implements FractionInterface {

    private int numerator, denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    @Override
    public int getNumerator() {
        return this.numerator;
    }

    @Override
    public int getDenominator() {
        return this.denominator;
    }

    @Override
    public FractionInterface add(FractionInterface f) {
        int a = this.getNumerator();
        int b = this.denominator;

        int c = f.getNumerator();
        int d = f.getDenominator();

        int resultNumerator = a * d + b * c;
        int resultDenominator = b * d;
        return new Fraction(resultNumerator, resultDenominator);

    }

    @Override
    public FractionInterface subtract(FractionInterface f) {
        int a = this.getNumerator();
        int b = this.denominator;

        int c = f.getNumerator();
        int d = f.getDenominator();

        int resultNumerator = a * d - b * c;
        int resultDenominator = b * d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public FractionInterface multiply(FractionInterface f) {
        int a = this.getNumerator();
        int b = this.denominator;

        int c = f.getNumerator();
        int d = f.getDenominator();

        int resultNumerator = a * c;
        int resultDenominator = b * d;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public FractionInterface divide(FractionInterface f) {
        int a = this.getNumerator();
        int b = this.denominator;

        int c = f.getNumerator();
        int d = f.getDenominator();

        if(c == 0 || d == 0){
            return new Fraction();
        }
        int resultNumerator = a * d;
        int resultDenominator = b * c;
        return new Fraction(resultNumerator, resultDenominator);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }

}
