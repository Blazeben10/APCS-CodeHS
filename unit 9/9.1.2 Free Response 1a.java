
public boolean dangerousDescent(int[] elevation)
{
    int i;
    for (i = 1; i < elevation.length; i++)
    {
        if(((double)(elevation[i] - elevation[i - 1]) / 1000) < -0.05)
        {
            return true;
        }
    }
    return false;
}