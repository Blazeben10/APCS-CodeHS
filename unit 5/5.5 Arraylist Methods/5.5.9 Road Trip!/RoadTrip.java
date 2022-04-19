import java.util.ArrayList;

public class RoadTrip
{
    
    ArrayList<GeoLocation> myRoadTrip = new ArrayList<GeoLocation>();
    
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation geo = new GeoLocation(latitude, longitude, name);
        myRoadTrip.add(geo);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return myRoadTrip.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double tripLength = 0.0;
        for(int i = 0; i < myRoadTrip.size() - 1; i++)
        {
            tripLength += myRoadTrip.get(i).distanceFrom(myRoadTrip.get(i + 1));
            //break;
        }
        return tripLength;
    }
    
    // Return a formatted toString of the trip
    public String toString()
    {
        String myString = "";
        
        for(int i = 0; i < myRoadTrip.size(); i++)
        {
            myString += (i + 1) + ". " + myRoadTrip.get(i).toString() + "\n";
        }
        
        return myString;
    }
}