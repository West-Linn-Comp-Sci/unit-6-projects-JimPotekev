
/**
 * Write a description of class Radish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Radish extends Vegetable
{
    public Radish(){
        super("Radish", "Root");
        setInstructions("-Fertilize soil with compost or all-purpose fertilizer. \n-Then plant seeds 1/2 inch deep and 1 inch apart. \n-Keep soil consistently moist but do not waterlog the roots.");
    }
    
    public String feed(){
        return "Radishes have been fertilized";
    }
    
    public String water(){
        return "Radishes have been watered";
    }
    
    public String harvest(){
        return "Radishes have been harvested";
    }
}
