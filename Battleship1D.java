
/**
 * Write a description of class Battleship1D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship1D
{
    int[] board = {0, 0, 0, 0, 0, 0, 0};
    public Battleship1D(int[] grid){
        grid = board;
    }
    
    public int[] getArray(){
        return board;
    }
    
    public int[] placeShip(int spot){
        board[spot] = 1;
        board[spot + 1] = 1;
        board[spot + 2] = 1;
        return board;
    }
    
    public String guess(int position){
        if(board[position] == 1){
            board[position] = 0;
            return "Hit!";
        }
        return "Miss";
    }
    
    public String checkSink(){
        int count = 0;
        for(int element : board){
            if( element == 1){
                count ++;
            }
        }
        if(count == 0){
            return "Ship has sunk, you won!";
        }
        return "Ship is still afloat, keep guessing";
    }
}
