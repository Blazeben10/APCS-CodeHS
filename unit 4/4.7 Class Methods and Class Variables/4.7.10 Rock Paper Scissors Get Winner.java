private String getWinner(String user, String computer)
{
    // Return the proper string for the result.
    String USER_PLAYER = "User wins!";
    String COMPUTER_PLAYER = "Computer wins!";
    String TIE = "Tie";

    // Your code here
    if(user.equals(computer))
    return TIE;
    else if(user.equals("rock") && computer.equals("paper"))return COMPUTER_PLAYER;
    else if(user.equals("rock") && computer.equals("scissors"))return USER_PLAYER;
    else if(user.equals("paper") && computer.equals("scissors"))return COMPUTER_PLAYER;
    else if(user.equals("paper") && computer.equals("rock"))return USER_PLAYER;
    else if(user.equals("scissors") && computer.equals("rock"))return COMPUTER_PLAYER;
    else if(user.equals("scissors") && computer.equals("paper"))return USER_PLAYER;
    else return TIE;
    
}
