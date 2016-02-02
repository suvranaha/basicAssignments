
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
public class ReverseNumber {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Please Enter the original number:");
        int originalNumber = Integer.parseInt(br.readLine());
        int reverseNumber = 0;
        while(originalNumber>0)
        {
            int remainder = originalNumber%10;
            reverseNumber = (reverseNumber*10)+remainder;
            originalNumber = originalNumber/10;
        }
        System.out.print("Please Enter the reverse Number:"+reverseNumber);
    }
}
