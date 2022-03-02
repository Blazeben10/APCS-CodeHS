import java.util.Scanner; 
import java.lang.*;
public class ExtremeMain extends ConsoleProgram
{
    
    public void run()
    {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
    
        // Create an Extremes object
        Extremes x = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the max value");
        int number1 = input.nextInt();
        
        // Compute and display the difference
        // between the max and the guess
        int finalMax = x.maxDiff(number1);
        System.out.println("You were off by " + finalMax);
        
        // Ask the user to guess the minimum value of an Integer
         System.out.println("Guess the min value");
        int number2 = input.nextInt();
        
        // Compute and display the difference 
        // between the min and the guess
        int finalMin = x.minDiff(number2);
        System.out.println("You were off by " + "-" + finalMax);
        
    }
}