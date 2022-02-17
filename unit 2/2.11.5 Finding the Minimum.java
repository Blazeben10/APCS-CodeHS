public class FindMinimum extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three ints and 
        // print out the minimum
        int firstNum = readInt("Enter first number: ");
        int secondNum = readInt("Enter second number: ");
        int thirdNum = readInt("Enter third number: ");
        
        if(firstNum < secondNum)
        {
            if(firstNum<thirdNum)
            {
                System.out.print(firstNum);
            }
            else
            {
                System.out.print(thirdNum);
            }
        }
        else
        {
            if(secondNum< thirdNum){
                System.out.print(secondNum);
            }
            else{
                System.out.print(thirdNum);
            }
        }
        
    }
}