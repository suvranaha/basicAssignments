/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlcox
 */
public class FindLargestSmallestNumber {
    public static void main(String[] args){
        int[] numbers = new int[]{32,43,53,54,32,65,63,98,43,23}; 
        int smallest = numbers[0];
        int largest = numbers[0];
        for(int i=1; i<numbers.length; i++)
        {
            if(numbers[i]>largest)
            largest = numbers[i];
            else if(numbers[i]<smallest)
            smallest = numbers[i];
        }
        System.out.println("Lasgest number is : "+largest);
        System.out.println("Smallest number is : "+smallest);
    }
}
