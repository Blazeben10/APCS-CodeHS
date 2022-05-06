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

    /**
     * Begin My Code
     */
    public ArrayList<Waste> getWasteBin(String wasteType)
    {
        if(wasteType == Waste.TRASH_TYPE){
            return trashBin;
        } else if(wasteType == Waste.COMPOST_TYPE){
            return compostBin;
        } else {
            return recyclingBin;
        }
    }
}