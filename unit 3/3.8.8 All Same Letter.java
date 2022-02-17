public boolean allSameLetter(String str)
{
    char c1 = str.charAt(0);
    int length = str.length();
    for(int i=1; i<length; i++)
    {
        char temp = str.charAt(i);
        if(c1 != temp)
        {
            return false;
        }
    }
    return true;
}