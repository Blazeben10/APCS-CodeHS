public class isCharTester extends ConsoleProgram
{
    public void run()
    {
        // Start here!
        String word = "This is a sentence";
        String key = "a";
        System.out.println("The character "+ key+ " is in the String "+ word + ": " + isChar(word, key));
    }
    
    public static boolean isChar(String string, String key)
    {
        // Write a more efficient version of isChar than the one in the exercise description
        // Use the hint!
        for (int i = 0; i < string.length(); i++)
        {
            return true;
        }
        return false; 
    }
}