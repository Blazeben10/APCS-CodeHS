public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;
    
    private boolean shipStatus;
    private int status;
    
    // Location constructor. 
    public Location(){
        shipStatus = false;
        status = UNGUESSED;
    }
    
    // Was this Location a hit?
    public boolean checkHit(){
        return status == HIT;
    }
    
    // Was this location a miss?
    public boolean checkMiss(){
        return status == MISSED;
    }
    
    // Was this location unguessed?
    public boolean isUnguessed(){
        return status == UNGUESSED;
    }
    
    // Mark this location a hit.
    public void markHit(){
        status = HIT;
    }
    
    // Mark this location a miss.
    public void markMiss(){
        status = MISSED;
    }
    
    // Return whether or not this location has a ship.
    public boolean hasShip(){
        return shipStatus;
    }
    
    // Set the value of whether this location has a ship.
    public void setShip(boolean val){
        shipStatus = val;
    }
    
    // Set the status of this Location.
    public void setStatus(int status){
        if(status == UNGUESSED || status == HIT || status == MISSED){
            this.status = status;
        }
    }
    
    // Get the status of this Location.
    public int getStatus(){
        return status;
    }
    
}