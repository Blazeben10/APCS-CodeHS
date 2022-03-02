public class TShirt extends Clothing
{
    /*
    private String size;
    private String color;
    private String fabric;
    
    
    public TShirt(String Size, String Color, String Fabric)
    {
        size = Size;
        color = Color;
        fabric = Fabric;
    }
    
    
    public String fabric()
    {
        return this.fabric;
    }
    */
    
    private String fabric;

    public TShirt(String size, String color, String fabric)
    {
        super(size,color);
        this.fabric=fabric;
    }

    public String getFabric()
    {
        return this.fabric;
    }
    
}