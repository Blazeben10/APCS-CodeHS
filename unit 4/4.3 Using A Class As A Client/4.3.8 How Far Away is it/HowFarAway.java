public class HowFarAway extends ConsoleProgram
{
    public void run()
    {
        // your code here.
        
        
        double latitude = readDouble("Enter the latitude of the starting location: ");
        double longitude1 = readDouble("Enter the longitude of the starting location: ");
        double latitude2 = readDouble("Enter the latitude of the ending location: ");
        double longitude2 = readDouble("Enter the longitude of the ending location: ");
       
        GeoLocation loc1 = new GeoLocation(latitude, longitude1);
        GeoLocation loc2 = new GeoLocation(latitude2, longitude2);
        double distance = loc1.distanceFrom(loc2);
        System.out.println("The distance is "+distance +" miles.");
    }
}