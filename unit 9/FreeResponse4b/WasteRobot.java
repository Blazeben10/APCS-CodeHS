import java.util.*;

public class WasteRobot
{
    private ArrayList<Waste> trashBin;
    private ArrayList<Waste> compostBin;
    private ArrayList<Waste> recyclingBin;

    public WasteRobot() 
    {
        trashBin = new ArrayList<Waste>();
        compostBin = new ArrayList<Waste>();
        recyclingBin = new ArrayList<Waste>();
        
        trashBin.add(new Trash("Plastic Bag"));
        compostBin.add(new Compost("Banana Peel"));
        recyclingBin.add(new Recycling("Soda Can"));
    }
    
    // Implement this!
    public void sortWaste(ArrayList<Waste> wasteToSort)
    {
        for(int i = 0; i < wasteToSort.size(); i++)
        {
            Waste waste = wasteToSort.get(i);
            getWasteBin(waste.getWasteType()).add(waste);
        }
    }
    
    public ArrayList<Waste> getWasteBin(String wasteType)
    {
        if (wasteType.equals(Waste.TRASH_TYPE))
        {
            return trashBin;
        }
        else if (wasteType.equals(Waste.COMPOST_TYPE))
        {
            return compostBin;
        }
        else
        {
            return recyclingBin;
        }
    }

}