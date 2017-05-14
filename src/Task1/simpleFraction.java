package Task1;

class simpleFraction {
    private int numerator = 0;
    private int denominator = 0;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public simpleFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    simpleFraction() {
    }

    public void fractionPrint() {
        System.out.print(getNumerator() + "/" + getDenominator() + "\t");
    }

    public void inverseFractionPrint() {
        System.out.print(getDenominator() + "/" + getNumerator() + "\t");
    }

}