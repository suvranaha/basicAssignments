
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SwapTwoNumberWithoutThirdVariable {
    public static void main(String[] args)
    {
        int number1 = 0;
        int number2 = 0;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.print("Enter your first number :");
            number1 = Integer.parseInt(br.readLine());
            System.out.print("Enter your second number :");
            number2 = Integer.parseInt(br.readLine());
        }
        catch(IOException ioe){
            System.out.print("IO Error :"+ioe);
            System.exit(0);
        } 
        number1 = number1+number2;
        number2 = number1-number2;
        number1 = number1-number2;
        
        System.out.println("After Swap first number is :"+number1);
        System.out.println("After Swap second number is :"+number2);
    }
}
