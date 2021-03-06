public class Fraction
{
    // Create your instance variables and constructor here
    private int num, denom;
    
    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom == 0 ? 1 : denom;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return num;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denom;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        num = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denom = x == 0 ? 1 : x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        int otherNum = other.getNumerator();
        int otherDenom = other.getDenominator();
        
        num = num * otherDenom + otherNum * denom;
        denom = denom * otherDenom;
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        int otherNum = other.getNumerator();
        int otherDenom = other.getDenominator();
        
        num = num * otherDenom - otherNum * denom;
        denom = denom * otherDenom;
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        int otherNum = other.getNumerator();
        int otherDenom = other.getDenominator();
        
        num *= otherNum;
        denom *= otherDenom;
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return num + " / " + denom;
    }
}