// Take Input from user and print the numbers

// Input : 5
// Output : -5  -4  -3  -2  -1

import java.util.*;

class Program110
{
    public static void Display(int iNo)
    {
        for(int iCnt = -iNo; iCnt < 0; iCnt++)
        {
            System.out.print(iCnt + "\t");
        }
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the frequency: ");
        int iFrequency = sc.nextInt();

        Display(iFrequency);
    }
}