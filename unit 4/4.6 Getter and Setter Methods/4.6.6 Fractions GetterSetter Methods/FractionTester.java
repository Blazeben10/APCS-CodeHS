public class FractionTester extends ConsoleProgram
{
    public void run()
    {
        // Add code here to test out your Fraction class!
        Fraction half = new Fraction(1,2);
        System.out.println(half);
        System.out.println("numerator is" +half.getNumerator());
        System.out.println("denominator is "+half.getDenominator());
        half.setNumerator(3);
        half.setDenominator(5);
        
        
    }
}