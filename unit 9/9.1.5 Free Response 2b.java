public int countPattern(String dna, String pattern)
{
    // local variables
    int countNumber = 0;
    int i;
    
    // main conditional
    for(i = 0; i <= (dna.length() - pattern.length()); i++)
    {
        // secondary conditional
        if(dna.substring(i, i + pattern.length()).equals(pattern))
        {
            countNumber++;
        }
    }
    //return statement
    return countNumber;
}