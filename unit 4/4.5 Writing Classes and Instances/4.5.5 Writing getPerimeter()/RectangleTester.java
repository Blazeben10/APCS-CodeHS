public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        // Create and test Rectangle objects here!
        Rectangle r1 = new Rectangle(10,2);
        System.out.println(r1);
        
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
    }
}