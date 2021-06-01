
/**
 * Write a description of class lettuce here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lettuce extends Vegetable
{
    public Lettuce(){
        super("Lettuce", "leaf");
        setInstructions("-Plant seeds 1/8 to 1/4 inch deep. \n-Then use an organic fertilizer so the soil is nutrient rich. \n-Water regularly or when you feel it needs watering.");
    }
    
    public String feed(){
        return "Lettuce has been fertilized";
    }
    
    public String water(){
        return "Lettuce has been watered";
    }
    
    public String harvest(){
        return "Lettuce has been harvested";
    }
}
