import java.util.Scanner;  
public class PickupWindow extends ConsoleProgram
{
    
    public void run()
    {
        
        //create scanner object
        Scanner input = new Scanner(System.in);
        
        // Display menu
        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);
        
        //Get customer order
        //String customerOrder = readLine("Enter label: ");
        
        System.out.println("Enter label: ");
        
        String customerOrder = input.nextLine(); 
        
        // Use substring to get the first character (the number)
        String combo = menu.substring(0,1);
        
        // Create an Integer object by using the static
        //method Integer.valueOf(someString)
          
        // to turn the string into an Integer
        Integer comboNumber = Integer.valueOf(customerOrder);
       // Integer comboNumber =  Integer.parseInt(customerOrder);
        
        // Print out what the customer ordered
        System.out.println("Customer ordered number " + comboNumber);
    }
}