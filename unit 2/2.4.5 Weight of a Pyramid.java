public class Pyramid extends ConsoleProgram
{
    public void run()
    {
        
        double weight = 2.5;
        
        int blocks = readInt("Enter the number of blocks used to build the pyramid: ");
        //int total = blocks * weight;
        System.out.println("The pyramid weighs "+ (blocks*2.5)+" tons");
    }
}