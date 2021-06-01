
/**
 * Write a description of class beets here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Beets extends Vegetable
{
    public Beets(){
        super("Beets", "root");
        setInstructions("-Plant a cluster of seeds 1/2 inch deep and 1-2 inches apart. \n-Then Mulch and Water regularly with about and inch of water per sqaure foot a week. \n-Fertilizer isn't recessary but you should use a cover to prevent pests from eating the leaves.");
    }
    
    public String feed(){
        return "Beets have been fed";
    }
    
    public String water(){
        return "Beets have been watered";
    }
    
    public String harvest(){
        return "Beets have been harvested";
    }
}
