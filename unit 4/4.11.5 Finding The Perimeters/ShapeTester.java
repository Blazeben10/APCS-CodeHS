public class ShapesTester extends ConsoleProgram
{
    public void run()
    {
        Shape rectangle = new Rectangle(10, 20);
        System.out.println("Name: " + rectangle.getName());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        Shape r2 = new Rectangle(5, 10);
        System.out.println("Name: " + r2.getName());
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
        System.out.println();

        Shape circle = new Circle(10);
        System.out.println("Name: " + circle.getName());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        Shape square = new Square(6);
        System.out.println("Name: " + square.getName());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();

        Shape pentagon = new Pentagon(5);
        System.out.println("Name: " + pentagon.getName());
        System.out.println("Area: " + pentagon.getArea());
        System.out.println("Perimeter: " + pentagon.getPerimeter());
        System.out.println();

    }
}