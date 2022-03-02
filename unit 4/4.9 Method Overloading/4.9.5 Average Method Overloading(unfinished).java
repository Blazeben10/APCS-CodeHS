public class Average extends ConsoleProgram
{
    public void run()
    {
        int intValue = 5;
        double doubleValue = 2.5;
        
        int average1 = average(intValue, intValue);
        System.out.println(average1);
        
        // Use method overloading to define methods 
        // for each of the following method calls
        
        double average2 = average(doubleValue, doubleValue);
        System.out.println(average2);
        
        int average3 = average(intValue, intValue, intValue);
        System.out.println(average3);
        
        double average4 = average(intValue, doubleValue);
        System.out.println(average4);
        
        double average5 = average(doubleValue, intValue);
        System.out.println(average5);
        
        double average6 = average(doubleValue, doubleValue, doubleValue);
        System.out.println(average6);
    }
    
    // Returns a truncated average of two integers
    public int average(int one, int two)
    {
        return (one + two) / 2;
    }
    
    public double average(double one, double two)
    {
        return (one + two) / 2;
    }
    public double average(int one, double two)
    {
        return(one + 2) / 2;
    }
    public double average (double one, int two)
    {
        return (one + 2) / 2;
    }
    
    public int average (int one, int two, int three)
    {
        return (one + two + three) / 3;
    }
    
    public double average(double one, double two, double three)
    {
        return(one + two + three) / 3;
    }
}