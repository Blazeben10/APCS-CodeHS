public class CastingToDouble extends ConsoleProgram
{
    public void run()
    {
        int firstInt = readInt("First Int: ");
        int secondInt = readInt("Second Int: ");
        double total = (double)firstInt/secondInt;
        System.out.println(total);
    }
}