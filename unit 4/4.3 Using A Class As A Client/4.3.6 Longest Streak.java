public class LongestStreak extends ConsoleProgram
{
    public static final int FLIPS = 100;
    public void run()
    {
        int streak = 0;
        int longestStreak = 0;
        for(int i=0; i < FLIPS; i++)
        {
            if(Randomizer.nextBoolean())
            {
                System.out.println("Heads");
                streak++;
            }
            else
            {
                System.out.println("Tails");
                if(longestStreak < streak)
                {
                    longestStreak = streak;
                }
                streak = 0;
            }
        }
        System.out.println("Longest streak of heads: "+ longestStreak);
    }
}