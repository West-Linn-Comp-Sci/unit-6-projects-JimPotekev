/**
 * Write a description of class codingAssignment here.
 *
 * @author (Jimmy Potekev)
 * @version (4/29/21)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class codingAssignment
{
     public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        System.out.println("How many inputs will you have?");
        int numInputs = input.nextInt();
        System.out.println("Enter exactly " + numInputs + " numbers between 1-100 with spaces inbetween");
        for(int i = 0; i < numInputs; i++){
            list.add(input.nextInt());
        }
        int numThru10 = 0;
        int numThru20 = 0;
        int numThru30 = 0;
        int numThru40 = 0;
        int numThru50 = 0;
        int numThru60 = 0;
        int numThru70 = 0;
        int numThru80 = 0;
        int numThru90 = 0;
        int numThru100 = 0;
        
        for (int num: list){
            if(num >=  1 && num <= 10){
                numThru10 ++;
            }
            else if(num >= 11 && num <= 20){
                numThru20 ++;
            }
            else if(num >= 21 && num <= 30){
                numThru30 ++;
            }
            else if(num >= 31 && num <= 40){
                numThru40 ++;
            }
            else if(num >= 41 && num <= 50){
                numThru50 ++;
            }
            else if(num >= 51 && num <= 60){
                numThru60 ++;
            }
            else if(num >= 61 && num <= 70){
                numThru70 ++;
            }
            else if(num >= 71 && num <= 80){
                numThru80 ++;
            }
            else if(num >= 81 && num <= 90){
                numThru90 ++;
            }
            else if(num >= 91 && num <= 100){
                numThru100 ++;
            }
        }
        
        System.out.print(" 1 - 10 | ");
        for(int i = 0; i < numThru10; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("11 - 20 | ");
        for(int i = 0; i < numThru20; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("21 - 30 | ");
        for(int i = 0; i < numThru30; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("31 - 40 | ");
        for(int i = 0; i < numThru40; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("41 - 50 | ");
        for(int i = 0; i < numThru50; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("51 - 60 | ");
        for(int i = 0; i < numThru60; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("61 - 70 | ");
        for(int i = 0; i < numThru70; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("71 - 80 | ");
        for(int i = 0; i < numThru80; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("81 - 90 | ");
        for(int i = 0; i < numThru90; i ++){
            System.out.print("*");
        }
        System.out.println();
        System.out.print("91 - 100| ");
        for(int i = 0; i < numThru100; i ++){
            System.out.print("*");
        }
        System.out.println();
    }

}