public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int x, int y)
    {
        numerator = x;
        denominator = y;
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public void setNumerator(int x)
    {
        numerator = x;
    }
    
    public void setDenominator(int x)
    {
        denominator = x;
    }
    
    public String toString()
    {
        return numerator+ "/" + denominator;
    }   
}