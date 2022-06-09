public abstract class Waste
{
    public static final String TRASH_TYPE = "trash";
    public static final String COMPOST_TYPE = "compost";
    public static final String RECYCLING_TYPE = "recycling";

    private String wasteType;
    private String wasteName;

    public Waste(String wasteType, String wasteName) {
        this.wasteType = wasteType;
        this.wasteName = wasteName;
    }

    public String getWasteType()
    {
        return wasteType;
    }
    
    public String toString()
    {
        return wasteType + ": " + wasteName;
    }
}