public class FindEvenOdd {
    public static void main(String[] args){
        int[] numbers;
        numbers = new int[]{10,21,56,78,51,89,7,80,99,100};
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i]%2==0)
            {
                System.out.println(numbers[i]+" is even number");
            }
            else
            {
                System.out.println(numbers[i]+" is odd number");
            }
        }
    }
}
