public class Clothing
{
    // all instance variables should be private
    private String size;
    private String color;
    // private int x;

    // default constructor
    /* 
    public Clothing ()
    {
        // intialize all instance variables
        size="";
        color="";
        x=0;
    }
    */
    // only intialize when the parameter is empty or zero argument

    public Clothing(String size, String color)
    {
        this.size=size;
        this.color=color;
        // this.x=0;

        // always initialize all the instance variables
        //even though the parameters are incomplete
    }


    public String getSize()
    {
        return this.size;
    }
    public String getColor()
    {
        return this.color;
    }

}