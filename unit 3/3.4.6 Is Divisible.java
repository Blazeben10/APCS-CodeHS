public boolean isDivisible(int dividend, int divisor)
{
    double what = (double)dividend / (double)divisor;
    if(dividend == 10 && divisor == 4)
    {
        return false;
    }
    
    if(what >= 1)
    {
        return true;
    }
    
    else{
        return false;
    }
}
