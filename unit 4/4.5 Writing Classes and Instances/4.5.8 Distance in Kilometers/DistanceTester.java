public class DistanceTester extends ConsoleProgram
{
    public static double SAN_FRANCISCO_LONGITUDE = 122.4167;
    public static double SAN_FRANCISCO_LATITUDE = 37.7833;
    public static double NEW_YORK_LONGITUDE = 74.0059;
    public static double NEW_YORK_LATITUDE = 40.7127;
    
    /**
     * This program computes the distance in miles between San Francisco, California
     * and New York City, New York using the GeoLocation class.
     * 
     * After running this program, try looking it up on Google Maps. How close are we?
     */
    public void run()
    {
        GeoLocation sf = new GeoLocation(SAN_FRANCISCO_LATITUDE, SAN_FRANCISCO_LONGITUDE);
        GeoLocation nyc = new GeoLocation(NEW_YORK_LATITUDE, NEW_YORK_LONGITUDE);
        double distance = sf.distanceFromInKilometers(nyc);
        System.out.println("The distance from San Francisco to New York is " + distance + " kilometers");
    }
}