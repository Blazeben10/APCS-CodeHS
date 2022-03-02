public class Dragon {


    private int level;
    
    
    private String attack;
    
    
    public Dragon(int aLevel, String aAttack) {
    
        super();
        level = aLevel;
        attack = aAttack;
    
    }
    
    public int getLevel() {
    
        return level;
    
    }
    
    
    
    public void setLevel(int aLevel) {
    
        level = aLevel;
    }
    
    
    
    public String getAttack() {
    
        return attack;
    }
    
    
    public void setAttack(String aAttack) {
    
        attack = aAttack;
    }
    
    public String toString() {
    
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
    
    
    
    public String fight(){
    

        String str="";
        
        
        for(int i=0;i<level;i++)
        str+=attack;
    
        return str;
    
    }
}