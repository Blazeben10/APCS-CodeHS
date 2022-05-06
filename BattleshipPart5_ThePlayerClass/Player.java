public class Player
{
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private static final int NUM_OF_SHIPS = 5;
    private Ship[] ships;
    private Grid myGrid = new Grid();
    private Grid enemyGrid = new Grid(); 
    private int shipCount = 0;

    
    public Player(){
        ships = new Ship[NUM_OF_SHIPS];
        for(int i = 0; i < NUM_OF_SHIPS; i++){
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        }
    }
    
    public void printMyShips(){
        myGrid.printShips();
    }
    
    public void printOpponentGuesses(){
        enemyGrid.printStatus();
    }
    
    public void printMyGuesses()
    {
        myGrid.printStatus();
    }
    
    public void chooseShipLocation(Ship ship, int row, int col, int direction){
        if(shipCount < 5){
            ship.setLocation(row, col);
            ship.setDirection(direction);
            myGrid.addShip(ship);
            shipCount++;
        }
    }
    
    public void recordOpponentGuess(int row, int col){
        if(myGrid.hasShip(row, col)){
            enemyGrid.markHit(row, col);
        }
        else{
            enemyGrid.markMiss(row, col);
        }
    }
}