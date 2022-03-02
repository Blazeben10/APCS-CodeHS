public class City
{
    
    private int population;
    private String name;

    public City(String name, int population)
    {
        this.name = name;
        this.population = population;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getValue()
    {
        return this.population;
    }
    
    

    public int add(City other)
    {
        return getValue() + other.getValue();
    }
}

