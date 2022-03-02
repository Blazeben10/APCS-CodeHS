public class RectangleTester extends ConsoleProgram
{
    public void run()
    {
        Rectangle rect1 = new Rectangle(5, 4);
        Rectangle rect2 = new Rectangle(5, 4);
        Rectangle rect3 = new Rectangle(10, 4);
        
        // Print all three rectangles
        System.out.println("A rectangle width of "+5+" and a height of "+4);
        // Print one true statement comparing rectangles
        if(rect1.equals(rect1))
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        if(rect1.equals(rect2))
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        // Print one false statment comparing rectangles
    }
}