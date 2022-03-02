public class Fraction implements Comparable<Fraction>
{
    private double theFrac;
    
    
    public Fraction(int numerator, int denominator){
        theFrac = (double)numerator / denominator;
    }
    
    public double getFrac(){
        return theFrac;
    }
    public int compareTo(Fraction other){
        double diff = getFrac() - other.getFrac();
        return (int)Math.signum(diff);
    }
    public boolean equals(Object other){
        if (other instanceof Fraction){
        
            if (this.compareTo((Fraction)other) == 0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}