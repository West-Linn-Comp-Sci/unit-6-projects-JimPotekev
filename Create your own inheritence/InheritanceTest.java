
/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InheritanceTest
{
    public static void main(String[]args){
        Phone davesPhone = new Phone(600);
        System.out.println("Dave has owned his phone for " + davesPhone.getYearsOwned() + " Years");
        System.out.println("The current value of daves phone is " + davesPhone.currentValue() + "$");
        System.out.println();
        
        Phone tobysPhone = new SmartPhone(1200);
        System.out.println("Tobys phone cost " + tobysPhone.getPrice() + "$");
        System.out.println();
        
        SmartPhone EdsPhone = new SmartPhone(1150.5);
        System.out.println("Ed is " + EdsPhone.contact("Dave"));
        System.out.println(EdsPhone.toString());
        System.out.println();
        
        Iphone fergusonsPhone = new Iphone(890.9);
        Iphone heraldsPhone = new Iphone(880.4);
        fergusonsPhone.setMake("12 pro");
        heraldsPhone.setMake("8 plus");
        System.out.println("Ferugson has the " + fergusonsPhone.getMake());
        System.out.println("Herald has the " + heraldsPhone.getMake());
        System.out.println("The Iphone is a type of " + fergusonsPhone.getPhoneType());
        System.out.println("Ferguson is " + fergusonsPhone.contact("Ed"));
        if(fergusonsPhone.compareTo(heraldsPhone) == 1){
            System.out.println("Heralds Phone costs more");
        }
        else if(heraldsPhone.compareTo(fergusonsPhone) == -1){
            System.out.println("Ferugusons Phone costs more");
        }
        else{
            System.out.println("Fergusons phone and Heralds phone cost the same");
        }
    }
}
