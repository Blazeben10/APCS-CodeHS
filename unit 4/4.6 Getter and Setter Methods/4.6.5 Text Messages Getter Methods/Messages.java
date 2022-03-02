public class Messages extends ConsoleProgram
{
    public void run()
    {
        // Your code here.
        // Create the two TextMessage objects and print them out.
       
        
        TextMessage bart= new TextMessage("Bart","Lisa", "Where are you?");
        TextMessage lisa = new TextMessage("Lisa", "Bart", "I'm at school!");
        
        System.out.println(bart);
        System.out.println("sent by " + bart.getSender());
        System.out.println("message "+bart.getMessage());
        System.out.println("sent to "+ bart.getReceiver());
        
        
        System.out.println(lisa);
        System.out.println("sent by "+lisa.getSender());
        System.out.println("message "+ lisa.getMessage());
        System.out.println("sent to "+lisa.getReceiver());
        
       
        
        
    }
}