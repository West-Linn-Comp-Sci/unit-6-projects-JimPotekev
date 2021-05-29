
/**
 * Write a description of class Battleship1DRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battleship1DRunner
{
    public static void main(String[]args){
        System.out.println("Welcome to battleship, lets begin!");
        System.out.println();
        
        int[] board = {0, 0, 0, 0, 0, 0, 0};
        Battleship1D grid = new Battleship1D(board);
        
        grid.placeShip(1);
        
        System.out.println("Guess at position: 1");
        System.out.println("Your guess was a " + grid.guess(0));
        System.out.println();
        System.out.println("Guess at position: 7");
        System.out.println("Your guess was a " + grid.guess(6));
        System.out.println();
        System.out.println("Guess at position: 2");
        System.out.println("Your guess was a " + grid.guess(1));
        System.out.println();
        System.out.println("Guess at position: 3");
        System.out.println("Your guess was a " + grid.guess(2));
        System.out.println();
        System.out.println("Guess at position: 4");
        System.out.println("Your guess was a " + grid.guess(3));
        System.out.println();
        
        System.out.println(grid.checkSink());
    }
}
