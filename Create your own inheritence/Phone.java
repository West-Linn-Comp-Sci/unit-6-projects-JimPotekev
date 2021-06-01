
/**
 * Write a description of class Parent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Phone
{
    private double price;
    private int yearsOwned;
    public Phone(double cost){
        price = cost;
        yearsOwned = 3;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getYearsOwned(){
        return yearsOwned;
    }
    
    public double currentValue(){
        double value = price * Math.pow(0.5, yearsOwned);
        return value;
    }
    
    public String toString(){
        return "Your phone cost " + price + "$ \n" +
                "Years owned: " + yearsOwned + "\n" +
               "Current value: " + price * Math.pow(0.5, yearsOwned);
    }
}
