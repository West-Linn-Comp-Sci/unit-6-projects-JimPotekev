
/**
 * Write a description of class Grandchild here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Iphone extends SmartPhone implements Comparable
{
    private String make;
    private double price;
    public Iphone(double cost){
        super(cost);
        this.make = make;
    }
    
    public void setMake(String modelNumber){
        make = "Iphone " + modelNumber;
    }
    
    public String getMake(){
        return make;
    }
    
    public String contact(String name){
        return "FaceTiming " + name;
    }
    
    public int compareTo(Object something){
        Iphone other = (Iphone) something;
        if(price > other.getPrice()){
            return 1;
        }
        else if(price < other.getPrice()){
            return -1;
        }
        return 0;
    }
    
    public String toString(){
        return "Phone type: Smartphone" + "\n" +
               "Phone make: " + make + "\n";
    }
}
