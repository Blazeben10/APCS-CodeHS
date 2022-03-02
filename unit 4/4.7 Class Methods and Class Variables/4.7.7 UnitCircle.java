public class UnitCircle extends ConsoleProgram
{
    public void run()
    {
        // Write your code here!
        System.out.println("Radians: (cos, sin)");
        double eachRadian = 0;
        for(int i =0; i < 8; i++)
        {
            System.out.println(Math.round(eachRadian * 100) / 100.0 + ": "
                + Math.round(Math.cos(eachRadian)*100) / 100.0 + ", "
                + Math.round(Math.sin(eachRadian)* 100) / 100.0);
            eachRadian += Math.PI/4;
        }
    }
}