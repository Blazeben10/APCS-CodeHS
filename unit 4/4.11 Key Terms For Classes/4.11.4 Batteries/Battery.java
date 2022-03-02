public class Battery
{
    public static double totalVoltage;
    public static int numOfBatteries;

    public double voltage;
        
    //private double voltage;
    
    public Battery(double voltage)
    {
        this.voltage = voltage;
        numOfBatteries++;
        totalVoltage = totalVoltage + voltage;
    }
    
    public double getVoltage()
    {
        return this.voltage;
    }
}