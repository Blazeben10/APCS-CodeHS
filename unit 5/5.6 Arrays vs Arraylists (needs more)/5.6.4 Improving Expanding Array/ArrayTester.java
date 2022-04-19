public class ArrayTester extends ConsoleProgram
{
    public void run()
    {
        ExpandingArray arr = new ExpandingArray();
        
        for(int i = 0; i < 100; i++)
        {
            System.out.println("adding " + i);
            arr.add(i);
        }
        
        for(int i = 0; i < 100; i++)
        {
            System.out.println(arr.get(i));
        }
        
    }
}