public class LargestValue extends ConsoleProgram
{
    public void run()
    { 
        int[] values = {32, 56, 79, 2, 150, 37}; 
          
        int highestValue = findMax(values); 
        System.out.println("The highest score is " + highestValue); 
    } 
    
    public static int findMax(int[] numbers) 
    {  
        int maxSoFar = numbers[0];
        
        // for each loop to rewrite as for loop 
        for (int num: numbers)  
        { 
            if (num> maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 
    return maxSoFar; 
    } 
}