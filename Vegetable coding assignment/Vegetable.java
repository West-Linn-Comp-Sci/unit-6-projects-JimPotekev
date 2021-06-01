
/**
 * Write a description of class fgh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vegetable implements Growable
{
    private String name;
    private String type;
    private String instructions;
    public Vegetable(String n, String t){
        name = n;
        type = t;
        instructions = "";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getType(){
        return type;
    }
    
    public String getInstructions(){
        return instructions;
    }
    
    public void setInstructions(String i){
        instructions = i;
    }
}
