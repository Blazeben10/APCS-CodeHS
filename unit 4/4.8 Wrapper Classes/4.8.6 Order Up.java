 
public class PickupWindow extends ConsoleProgram
{
    
    public void run()
    {
        
        // Display menu
        String menu = "1. Hamburger\n2. Cheeseburger\n3. Veggie Burger\n4. Nachos\n5. Hot Dog\n";
        
        System.out.println(menu);
        
        //Get customer order
        String customerOrder = readLine("Enter label: ");
        
        
        
        // Use substring to get the first character (the number)
        
        String combo = customerOrder.substring(0,1);

        // Create an Integer object by using the static
        //method Integer.valueOf(someString)
        // to turn the string into an Integer
        //Integer comboNumber = Integer.valueOf(customerOrder);
        Integer comboNumber =  Integer.valueOf(combo);
        
        // Print out what the customer ordered
        System.out.println("Customer ordered number " + comboNumber);
    }
}