public class Ship
{

    private int row;
    private int col;
    private int length;
    private String direction;
    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;
    
    public Ship(int leng)
    {
    
        length = leng;
        
        row = UNSET;
        
        col = UNSET;
    
    }
    
    public boolean isLocationSet()
    {
    
        if(col==-1||row==-1)
        {
    
            return false;
        
        }
    
        return true;
    
    }
    
    public boolean isDirectionSet()
    {
    
        if(direction==null)
        {
        
            return false;
        
        }
        
        return true;
    
    }
    
    public void setDirection(int direct)
    {
    
        if(direct==HORIZONTAL)
        {
        
            direction = "horizontal";
        
        }
    
        else if(direct==VERTICAL)
        {
        
            direction = "vertical";
        
        }
        else
        {
        
            direction = "unset";
        
        }
    
    }
    
    public void setLocation(int ro, int co)
    {
    
        row = ro;
        
        col = co;
    
    }
    
    public int getRow()
    {
    
        return row;
    
    }
    
    public int getCol()
    {
    
        return col;
    
    }
    
    public int getLength()
    {
    
        return length;
    
    }
    
    public int getDirection()
    {
    
        //if(direction == "vertical")
        if(direction.equals("vertical"))
        {
        
            return VERTICAL;
        
        }
    
        //else if(direction == "horizontal")
        else if(direction.equals("horizontal"))
        {
        
            return HORIZONTAL;
        
        }
    
        else
        {
        
            return UNSET;
        
        }
    
    }
    
    private String directionToString()
    {
    
        if(direction == null)
        {
        
        return "unset direction";
        }
        
        return direction;
    
    }
    
    private String locationToString()
    {
    
        if(this.isLocationSet() == false)
        {
        
            return "unset location";
        
        }
        
        return row + ", " + col;
    
    }
    
    public String toString()
    {
    
        return directionToString() + " ship of length " + length + " at (" + locationToString() + ")";
    
    }

}