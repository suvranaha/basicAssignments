
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlcox
 */
public class FindEvenOrOdd {
    public static void main(String[] args){
        float number = 0;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter the number which you want to check odd or even.");
            number = Float.parseFloat(br.readLine());
        }
        catch(IOException ioe){
            System.out.println("IO error "+ioe);
            System.exit(0);
        }
        if(number%2==0)
        {
            System.out.println(number+" is an even number");
        }
        else
        {
            System.out.println(number+" is an odd number");
        }
        
    }
}
