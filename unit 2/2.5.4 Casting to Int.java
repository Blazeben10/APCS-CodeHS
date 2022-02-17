public class CastingToInt extends ConsoleProgram
{
    public void run()
    {
        double myDouble = readDouble("Please input your double: ");
        int theirInt = (int)myDouble;
        System.out.println(theirInt);
    }
}