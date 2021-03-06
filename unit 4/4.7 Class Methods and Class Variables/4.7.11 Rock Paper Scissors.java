public class RockPaperScissors extends ConsoleProgram
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    private String getWinner(String user, String computer)
    {
        if(
            (user.equals("rock") && computer.equals("paper"))
            || (user.equals("paper") && computer.equals("scissors"))
            || (user.equals("scissors") && computer.equals("rock"))
        )
            return COMPUTER_PLAYER;
        
        if( user.equals(computer) )
            return TIE;
        
        return USER_PLAYER;
    }
    
    public void run()
    {
        while(true) {
            String user = readLine("Enter your choice (rock, paper, or scissors):").toLowerCase();
            
            if(user == null || user.equals(""))
                return;
            
            int rand = Randomizer.nextInt(3);
            String[] options = {"rock","paper","scissors"};
            String comp = options[rand];
            
            System.out.println("User: " + user);
            System.out.println("Computer: " + comp);
            System.out.println(getWinner(user,comp) );
        }
    }
}