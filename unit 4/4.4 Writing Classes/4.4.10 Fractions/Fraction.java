public class Fraction
{
    private int numerator;
    private int denominator;
    
    public Fraction(int x, int y)
    {
        numerator = x;
        denominator = y;
    }
    public String toString()
    {
        return numerator+ "/" + denominator;
    }
}