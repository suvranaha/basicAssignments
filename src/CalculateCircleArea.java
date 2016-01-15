import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateCircleArea {
    public static void main(String[] args){
        int radius = 0;
        System.out.println("Please enter radius of your circle");
        try{
            //get radius from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            radius = Integer.parseInt(br.readLine());
        }
        catch(NumberFormatException ne){
            System.out.println("Invalid radius value "+ne);
            System.exit(0);
        }
        catch(IOException ioe){
            System.out.println("IO Error"+ioe);
            System.exit(0);
        }
        double area = Math.PI*radius*radius;
        System.out.println("Your desired area of circle with radius "+radius+" is:"+area);
    }
    
}
