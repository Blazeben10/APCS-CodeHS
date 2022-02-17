public class Factorial extends ConsoleProgram
{
    public void run()
    {
        int in = readInt("What number would you like to compute the factorial for?");
        int i, fact=1;
        for(i=1;i<=in;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}