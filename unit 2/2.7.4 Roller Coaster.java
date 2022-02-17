public class RollerCoaster extends ConsoleProgram
{
    public void run()
    {
        boolean tallEnough = readBoolean("how tall are you: ");
        boolean oldEnough = readBoolean("How old are you: ");
        if(tallEnough && oldEnough)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}