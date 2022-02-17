public class Divisibility extends ConsoleProgram
{
    public void run()
    {
        int dividend = readInt("Enter the dividend: ");
        int divisor = readInt("Enter the divisor: ");

        if(divisor == 0){
            System.out.println(dividend + " is not divisible by " + divisor);
        }
        else if (dividend / divisor == (double) dividend / divisor){
            if(dividend / divisor == (double) dividend / divisor)
            {
                System.out.println(dividend + " is divisible by " + divisor + "!");
            }
        else
        {
            System.out.println(dividend + " is divisible by " + divisor);
        }
        }
        
    }
}