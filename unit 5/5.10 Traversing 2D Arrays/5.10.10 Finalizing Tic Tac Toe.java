public class TicTacToe
{
    //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;
    private String[][] board;
    public TicTacToe()
    {
        board = new String[3][3];
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                board[i][j] = "- ";
            }
        }
    }

    public String[][] getBoard()
    {
        return board;
    }

    //this method returns the current turn
    public int getTurn()
    {
        return turn;
    }

    /*This method prints out the board array on to the console
    */
    public void printBoard()
    {
        System.out.print(" ");
        System.out.print("0 ");
        System.out.print("1 ");
        System.out.print("2");
        System.out.println("");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
    }

    //This method returns true if space row, col is a valid space
    public boolean pickLocation(int row, int col)
    {
        if(row < 3 && col < 3)
        {
            if (board[row][col].equals("- "))
            {
                return true;
            }
        } else {
            System.out.println("Please input valid col/row");
        }
        return false;
    }

    //This method places an X or O at location row,col based on the int turn
    public void takeTurn(int row, int col)
    {
        if (turn % 2 == 0)
        {
            board[row][col] = "X ";
            turn = turn + 1;
            System.out.println ("Opponent's turn");
        } else {
            board[row][col] = "O ";
            turn = turn + 1;
            System.out.println ("Your turn");
        }
    }

    //This method returns a boolean that returns true if a row has three X or O's in a row
    public boolean checkRow()
    {
        for(int i = 0; i < 3; i++)
        {
            if (board[i][0].equals("X ") && board[i][1].equals("X ") && board[i][2].equals("X "))
            {
                System.out.println ("You won!");
                return true;
            } else if(board[i][0].equals("O ") && board[i][1].equals("O ") && board[i][2].equals("O ")) {
                System.out.println ("Your opponent won!");
                return true;
            }
        }
        return false;
    }

    //This method returns a boolean that returns true if a col has three X or O's
    public boolean checkCol()
    {
        for (int i = 0; i < 3; i++)
        {
            if (board[0][i].equals("X ") && board[1][i].equals("X ") && board[2][i].equals("X "))
            {
                System.out.println ("You won!");
                return true;
            } else if(board[0][i].equals("O ") && board[1][i].equals("O ") && board[2][i].equals("O ")) {
                System.out.println ("Your opponent won!");
                return true;
            }
        }
        return false;
    }

    //This method returns a boolean that returns true if either diagonal has three X or O's
    public boolean checkDiag()
    {
        if (board[0][0].equals("X ") && board[1][1].equals("X ") && board[2][2].equals("X "))
        {
            System.out.println ("You won!");
            return true;
        } else if (board[0][0].equals("O ") && board[1][1].equals("O ") && board[2][2].equals("O ")) {
            System.out.println ("Your opponent won!");
            return true;
        } else if (board[2][0].equals("X ") && board[1][1].equals("X ") && board[0][2].equals("X ")) {
            System.out.println ("You won!");
            return true;
        } else if (board[2][0].equals("O ") && board[1][1].equals("O ") && board[0][2].equals("O ")) {
            System.out.println ("Your opponent won!");
            return true;
        }
        return false;
    }

    //This method returns a boolean that checks if someone has won the game
    public boolean checkWin()
    {
        if (checkRow() == true || checkCol() == true || checkDiag() == true)
        {
            return true;
        }
        return false;
    }
}