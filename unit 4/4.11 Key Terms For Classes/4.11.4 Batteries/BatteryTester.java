public class BatteryTester extends ConsoleProgram
{
    public void run()
    {
        Battery aaBattery1 = new Battery(1.5);
        System.out.println("Total voltage: " + Battery.totalVoltage);
        System.out.println("Total batteries: " + Battery.numOfBatteries);
        
        Battery aaBattery2 = new Battery(1.5);
        System.out.println("Total voltage: " + Battery.totalVoltage);
        System.out.println("Total batteries: " + Battery.numOfBatteries);
        
        Battery aaBattery3 = new Battery(1.5);
        System.out.println("Total voltage: " + Battery.totalVoltage);
        System.out.println("Total batteries: " + Battery.numOfBatteries);
        
        Battery aaBattery4 = new Battery(1.5);
        System.out.println("Total voltage: " + Battery.totalVoltage);
        System.out.println("Total batteries: " + Battery.numOfBatteries);
        
    }
}