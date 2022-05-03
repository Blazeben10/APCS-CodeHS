/*
public class PlayerTester extends ConsoleProgram
{
    public void run()
    {
        // Test code here.
        // Test the Player class
        Player user = new Player();
        Player computer = new Player();
        
        // USER
        // First ship (with length 2), row 4, col 9, vertical
        user.chooseShipLocation(user.getShip(0), 4, 9, 1); 
        // Second ship (with length 3), row 9, col 2, horizontal
        user.chooseShipLocation(user.getShip(1), 9, 2, 0); 
        // Third ship (with length 3), row 5, col 3, horizontal
        user.chooseShipLocation(user.getShip(2), 5, 3, 0); 
        // Fourth ship (with length 4), row 1, col 3, horizontal
        user.chooseShipLocation(user.getShip(3), 1, 3, 0); 
        // Fifth ship (with length 5), row 4, col 9, vertical
        user.chooseShipLocation(user.getShip(4), 1, 1, 1); 
        
        // COMPUTER
        // First ship (with length 2), row 8, col 8, horizontal
        computer.chooseShipLocation(user.getShip(0), 8, 8, 0); 
        // Second ship (with length 3), row 6, col 1, vertical
        computer.chooseShipLocation(user.getShip(1), 6, 1, 1); 
        // Third ship (with length 3), row 4, col 3, vertical
        computer.chooseShipLocation(user.getShip(2), 4, 3, 1); 
        // Fourth ship (with length 4), row 0, col 5, horizontal
        computer.chooseShipLocation(user.getShip(3), 0, 5, 0); 
        // Fifth ship (with length 5), row 2, col 5, horizontal
        computer.chooseShipLocation(user.getShip(4), 2, 5, 0); 
        
        System.out.println("Player 1's Ships");
        user.printMyShips();
        System.out.println();
        System.out.println("Player 2's Ships");
        computer.printMyShips();
        System.out.println();
    }
}
*/