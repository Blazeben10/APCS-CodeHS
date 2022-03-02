public class Sweatshirt extends Clothing
{
 private boolean hood;

    public Sweatshirt(String size, String color, boolean hood)
    {
        super (size,color);
        this.hood=hood;
    }

    public boolean hasHood()
    {
        return this.hood;
    }
}