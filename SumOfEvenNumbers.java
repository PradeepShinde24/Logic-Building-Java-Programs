public class SumOfEvenNumbers
{
    public static void main(String[] args)
    {
        int count = 0;    // Counter for even numbers
        int sum = 0;      
        
        for (int i = 2; count < 1000; i += 2) {
            sum += i;
            count++;
        }
        
        System.out.println("The sum of the first 1000 even numbers is: " + sum);
    }
}