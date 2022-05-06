public int longestUphill(int[] elevation)
{
    // local variables
    int maxChange = 0;
    int changed, j, i;
    
    
    for (i = 0; i < elevation.length; i++)
    {
        
        for (j = i + 1; j < elevation.length; j++)
        {
            
            changed = (elevation[j] - elevation[i]);
            
            // Updates the maxChange value
            if (changed > maxChange)
            {
                maxChange = changed;
            }
            
        }
        
    }
    
    // return statement
    return maxChange;
}