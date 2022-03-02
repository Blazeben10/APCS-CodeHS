public class CoinFlips extends ConsoleProgram
{
    public static final int FLIPS = 100;
    
    public void run()
    {
        
        int x = 0;
        int y = 0;
        for(int i = 0; i < FLIPS; i++)
        {
            if(Randomizer.nextBoolean())
            {
                System.out.println("Heads");
                x++;
            }
            else
            {
                System.out.println("Tails");
                y++;
            }
        }
        
        
        
        System.out.println("Heads: " + x);
        System.out.println("Tails: " + y);
        
        int i = x;
        double d = i;
        double persentage = (d/FLIPS);
        System.out.println("% Heads: "+persentage);
        
        int b = y;
        d = b;
        persentage = (d/FLIPS);
        System.out.println("% tails: "+persentage);
    }
}