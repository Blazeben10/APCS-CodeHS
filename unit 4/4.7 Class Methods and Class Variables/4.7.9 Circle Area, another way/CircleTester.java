public class CircleTester extends ConsoleProgram
{
    public void run()
    {
        Circle c = new Circle(5);
        System.out.println("Area of a circle with radius 5: " + c.getArea());   

        Circle c2 = new Circle(12);
        System.out.println("Area of a circle with radius 12: " + c2.getArea());   

    }
}