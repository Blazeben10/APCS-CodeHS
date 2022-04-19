public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
     /*
        for(int i = 0; i < values.length; i++)
        {
            //continue
           
        }
    */
        double sum = 0;
        
        for(int num : values)
        {
            sum += num;
            
        }
        return sum / values.length;
   }
}