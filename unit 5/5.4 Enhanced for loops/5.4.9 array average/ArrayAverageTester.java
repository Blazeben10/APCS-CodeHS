public class ArrayAverageTester extends ConsoleProgram
{
    public void run()
   {
     int[] numArray =  {12, 17, 65, 7, 30, 88};
     
     // Create an ArrayAverage object and print the result 
     ArrayAverage average = new ArrayAverage(numArray);
     System.out.println("The average of the array is "+ average.getAverage());
   }
}