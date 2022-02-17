public int sumFrom(int start, int end)
{
    
    int sum = 0;
    int length = end-start;
    for(int i = start; i < end; i++ )
    {
        sum += i;
    }
    return sum;

}