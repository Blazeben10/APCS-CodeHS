public class GuessTheNumber extends ConsoleProgram
{
    public void run()
    {
        int secretNumber = 6;
        
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
        
        // Write your code here!
        
        
        boolean correct = false;
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");
        while(!correct){
            int guess = readInt("Enter your guess: ");
            if(guess == secretNumber){
                break;
            }
            else{
                System.out.println("Try again!");
            }
        }
        System.out.print("Correct!");
    }
}