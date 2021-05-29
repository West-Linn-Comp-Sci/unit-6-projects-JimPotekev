import java.util.ArrayList;
/**
 * Write a description of class random here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// A Purse holds a collection of Coins 
public class Purse{ 
    private ArrayList<Coin> coins;
    public Purse(){ 
        coins = new ArrayList(); 
    }
 
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
 
    // returns total value of all coins in purse 
    public double getTotal() { 
        double value = 0;
        for(Coin y: coins){
            value += y.getValue();
        }
        return value;
    } 
    
    public String findSmallest(){
        Coin min = coins.get(0);
        for(Coin c: coins){
            if(c.getValue() < min.getValue()) min = c;
        }
        return min.getName();
    }
    
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int count = 0;
        for(Coin x: coins){
            if(x == aCoin){
                count ++;
            }
        }
        return count;
    } 
 
    // returns the name of the Coin in the Purse that has the smallest value 
}


