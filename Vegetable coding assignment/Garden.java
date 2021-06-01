
/**
 * Write a description of class Garden here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class Garden
{
    public static void main(String[]args){
        List<Vegetable> garden = new ArrayList();
        garden.add(new Lettuce());
        garden.add(new Beets());
        garden.add(new Radish());
        
        for(int i = 0; i < garden.size(); i++){
            System.out.println(garden.get(i).getName());
            System.out.println(garden.get(i).getInstructions());
            System.out.println(garden.get(i).feed());
            System.out.println(garden.get(i).water());
            System.out.println(garden.get(i).harvest());
            System.out.println();
        }
    }
}
