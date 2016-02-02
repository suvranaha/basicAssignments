

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateRectanglePerimeter {

    public static void main(String []args){
        float length = 0;
        float breadth = 0;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Please enter the length of your rectangle.");
            length = Float.parseFloat(br.readLine());
            System.out.println("Please enter the breadth of your rectangle.");
            breadth = Float.parseFloat(br.readLine());
        }
        catch(NumberFormatException ne){
            System.out.println("Invalid value "+ne);
            System.exit(0);
        }
        catch(IOException ioe){
            System.out.println("IO error "+ioe);
            System.exit(0);
        }
        double perimeter = 2*(length+breadth);
        System.out.println("Your desired area of rectanage with length "+length+" and breadth"+breadth+" is:"+perimeter);
    }
    
}
