public class TripleDouble extends ConsoleProgram
{
    public void run()
    {
        //Ask for user input here:
        
        // Create a boolean called `tripleDouble`
        // that is true if
        // you had at least 10 in each category
        
        int points = readInt("Enter your points?");
        int rebounds = readInt("Enter your rebounds?");
        int assists = readInt("Enter your assists?");
        boolean tripleDouble; 
        if(points >= 10 && rebounds >=10 && assists >= 10)
        {
            tripleDouble = true;
        }
        else
        {
            tripleDouble = false;
        }
        
        System.out.println("Got a Triple Double? " + tripleDouble);
    }
}