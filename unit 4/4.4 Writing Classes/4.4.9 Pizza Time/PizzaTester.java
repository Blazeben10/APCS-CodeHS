public class PizzaTester extends ConsoleProgram
{
    public void run()
    {
        // Test your Pizza class here.
        Pizza pep = new Pizza("round", "peperoni", 3);
        System.out.println(pep);
        
        Pizza cheese = new Pizza("round", "cheese", 4);
        System.out.println(pep);
        
        Pizza vegie = new Pizza("round", "carrots", 5);
        System.out.println(vegie);
    }
}