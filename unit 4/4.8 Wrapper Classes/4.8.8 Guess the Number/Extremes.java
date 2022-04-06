public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        //Set min and max values 
        min = Integer.MIN_VALUE;
        max = Integer.MAX_VALUE;
    }
    
    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
        return max - number;
        //return Math.abs(max - number);
        
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
        return min - number;
        //return Math.abs(min - number);
        
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}