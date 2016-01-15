import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculateCirclePerimeter {
    public static void main(String []args){
        int radius = 0;
        System.out.println("Please enter your circle radius");
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            radius = Integer.parseInt(br.readLine());
        }
        catch(IOException ioe)
        {
            System.out.println("IO Error"+ioe);
            System.exit(0);
            
        }
        catch(NumberFormatException nfe){
            System.out.println("Invalid radius value"+nfe);
            System.exit(0);
        }
        double perimeter = 2*Math.PI*radius;
        System.out.println("Your desired perimeter of circle with radius "+radius+" is:"+perimeter);
    }
}
