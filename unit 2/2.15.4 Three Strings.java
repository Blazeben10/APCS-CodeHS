public class ThreeStrings extends ConsoleProgram
{
    public void run()
    {
        // Ask the user for three strings.
        // remember to use the readLine() method.
        String first = readLine("First string?");
        String second= readLine("Second string? ");
        String third = readLine("Third string? ");
        
        if(third.contains(first) && third.contains(second)) 
        {
            System.out.print(first + " + " + second + " is equal to " + third + "!");
        }
        else {
            System.out.print(first + " + " + second + " is not equal to " + third + "!");
        }
    }
}