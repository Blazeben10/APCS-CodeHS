public class Messages extends ConsoleProgram
{
    public void run()
    {
        
        
        // Your code here.
        // Create the two TextMessage objects and print them out.
        TextMessage bart= new TextMessage("Bart","Lisa", "Where are you?");
        TextMessage lisa = new TextMessage("Lisa", "Bart", "I'm at school!");
        System.out.println(bart);
        System.out.println(lisa);
    }

}  