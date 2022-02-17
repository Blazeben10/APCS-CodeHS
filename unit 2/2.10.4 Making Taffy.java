public class Taffy extends ConsoleProgram
{
    public void run()
    {
        System.out.println("Starting Taffy Timer...");
        // Start here!
        int temp = 0;

        System.out.println("Starting Taffy Timer...");
        
        while (temp < 270)
        {
            
        
            temp = readInt ("Enter the temperature.");
            
            if (temp < 270)
            {
            
                System.out.println("The mixture is not ready.");

            }
            
            boolean tempReady = temp >= 270;
            
            if (tempReady)
            {
            
                System.out.println("Your taffy is ready for the next step!");
            }
        
        }
    }
}