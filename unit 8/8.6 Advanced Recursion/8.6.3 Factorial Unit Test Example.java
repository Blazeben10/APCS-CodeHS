public int factorial(int x)
{
    
    // Base case
    if(x <= 1)
    {
        return 1;
    }
    // Recursive case
    return x * factorial(x - 1);
 
}
