public class PrintOdd extends ConsoleProgram
{
    public void run()
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
    }
    
    public void printOddIndices(int[] arr)
    {
        // Start here!
        for(int i = 0; i < arr.length; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}