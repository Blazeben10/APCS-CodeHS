public class FractionTester extends ConsoleProgram
{
    public void run()
    {
        // Implement the Fraction class in Fraction.java
        Fraction first = new Fraction(1, 2);System.out.println();
        
       
        // Then add code here to test out your Fraction class!
        
       
        
        Fraction second = new Fraction(1, 3);System.out.println();
        System.out.println("BEFORE:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        first.multiply(second);
        System.out.println("AFTER:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);
        
        
    }
}