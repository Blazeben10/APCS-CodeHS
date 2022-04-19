public double median(int[] arr)
{
    Arrays.sort(arr);
    if(arr.length % 2 != 0)
    {
        return arr[arr.length/2];
    }
    else
    {
        int half = arr.length/2;
        double first = arr[half-1];
        double second = arr[half];
        return (first + second)/2; 
    }
}