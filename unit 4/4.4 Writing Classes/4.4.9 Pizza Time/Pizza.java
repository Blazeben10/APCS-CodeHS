public class Pizza
{
    // Write your class here!   
    private String type;
    private String toppings;
    private int size;
    
    public Pizza(String theType, String theToppings, int theSize)
    {
        theType = type;
        theToppings = toppings;
        theSize = size;
    }
    
    public String toString()
    {
        return type +" "+ toppings + " "+ size;
    }
}