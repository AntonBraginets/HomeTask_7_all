package Task1;

public class Main {
    public static void main(String[] args) {
        simpleFraction Fraction1 = new simpleFraction(1, 2);
        simpleFraction Fraction2 = new simpleFraction(2, 3);
        simpleFraction Fraction3 = new simpleFraction(3, 4);
        System.out.println("Initial fractions:");
        Fraction1.fractionPrint();
        Fraction2.fractionPrint();
        Fraction3.fractionPrint();
        System.out.println();
        System.out.println("Inverse fractions:");
        Fraction1.inverseFractionPrint();
        Fraction2.inverseFractionPrint();
        Fraction3.inverseFractionPrint();
        System.out.println();
        System.out.println("Calculation of R:");
        int Num1 = 0;
        int Num2 = 0;
        int Den1 = 0;
        int Den2 = 0;
        if (Fraction1.getDenominator() == Fraction2.getDenominator()) {
            int sumNumerator = Fraction1.getNumerator() + Fraction2.getNumerator();
            //System.out.println(sumNumerator + "/" + Fraction1.getDenominator());
            Num1 = sumNumerator;
            Den1 = Fraction1.getDenominator();
        } else if (Fraction1.getDenominator() % Fraction2.getDenominator() != 0 &
                Fraction2.getDenominator() % Fraction1.getDenominator() != 0) {
            int newDenominator = Fraction1.getDenominator() * Fraction2.getDenominator();
            int newNumerator1 = Fraction1.getNumerator() * Fraction2.getDenominator();
            int newNumerator2 = Fraction2.getNumerator() * Fraction1.getDenominator();
            int sumNumerator = newNumerator1 + newNumerator2;
            //System.out.println(sumNumerator + "/" + newDenominator);
            Num1 = sumNumerator;
            Den1 = newDenominator;
        } else {
            if (Fraction1.getDenominator() > Fraction2.getDenominator()) {
                int newDenominator = Fraction2.getDenominator() * (Fraction1.getDenominator() / Fraction2.getDenominator());
                int newNumerator2 = Fraction2.getNumerator() * (Fraction1.getDenominator() / Fraction2.getDenominator());
                int sumNumerator = Fraction1.getNumerator() + newNumerator2;
                //System.out.println(sumNumerator + "/" + newDenominator);
                Num1 = sumNumerator;
                Den1 = newDenominator;
            }
            if (Fraction1.getDenominator() < Fraction2.getDenominator()) {
                int newDenominator = (Fraction2.getDenominator() / Fraction1.getDenominator()) * Fraction1.getDenominator();
                int newNumerator1 = (Fraction2.getDenominator() / Fraction1.getDenominator()) * Fraction1.getNumerator();
                int sumNumerator = newNumerator1 + Fraction2.getNumerator();
                //System.out.println(sumNumerator + "/" + newDenominator);
                Num1 = sumNumerator;
                Den1 = newDenominator;
            }
        }
        if (Fraction1.getDenominator() == Fraction3.getDenominator()) {
            int sumNumerator = Fraction1.getNumerator() + Fraction3.getNumerator();
            //System.out.println(sumNumerator + "/" + Fraction1.getDenominator());
            Num2 = sumNumerator;
            Den2 = Fraction1.getDenominator();
        } else if (Fraction1.getDenominator() % Fraction3.getDenominator() != 0 &
                Fraction3.getDenominator() % Fraction1.getDenominator() != 0) {
            int newDenominator = Fraction1.getDenominator() * Fraction3.getDenominator();
            int newNumerator1 = Fraction1.getNumerator() * Fraction3.getDenominator();
            int newNumerator3 = Fraction3.getNumerator() * Fraction1.getDenominator();
            int sumNumerator = newNumerator1 + newNumerator3;
            //System.out.println(sumNumerator + "/" + newDenominator);
            Num2 = sumNumerator;
            Den2 = newDenominator;
        } else {
            if (Fraction1.getDenominator() > Fraction3.getDenominator()) {
                int newDenominator = Fraction3.getDenominator() * (Fraction1.getDenominator() / Fraction3.getDenominator());
                int newNumerator3 = Fraction3.getNumerator() * (Fraction1.getDenominator() / Fraction3.getDenominator());
                int sumNumerator = Fraction1.getNumerator() + newNumerator3;
                //System.out.println(sumNumerator + "/" + newDenominator);
                Num2 = sumNumerator;
                Den2 = newDenominator;
            }
            if (Fraction1.getDenominator() < Fraction3.getDenominator()) {
                int newDenominator = (Fraction3.getDenominator() / Fraction1.getDenominator()) * Fraction1.getDenominator();
                int newNumerator1 = (Fraction3.getDenominator() / Fraction1.getDenominator()) * Fraction1.getNumerator();
                int sumNumerator = newNumerator1 + Fraction3.getNumerator();
                //System.out.println(sumNumerator + "/" + newDenominator);
                Num2 = sumNumerator;
                Den2 = newDenominator;
            }
        }
        System.out.println("R   = " + (Num1 * Num2) + "/" + (Den1 * Den2));
        System.out.println("1/R = " + (Den1 * Den2) + "/" + (Num1 * Num2));
    }
}
