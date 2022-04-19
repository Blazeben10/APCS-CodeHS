public int findMultipleOfThree(int[] arr)
{
     for(int i = arr.length -1; i >= 0; i--)
     {
          if(arr[i] % 3 == 0)
          {
              return i;
                
          }
      }
     return 0;
        
}