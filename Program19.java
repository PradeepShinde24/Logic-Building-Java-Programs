// Display the numbers 1 to X

import java.util.*;

class Program19
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the frequency for number print:");
        int iNo = sc.nextInt();

        Number.Display(iNo);
    }
}

class Number
{
    public static void Display(int iValue)               // Static keyword
    {
        if(iValue < 0)                                   // Filter
        {
            System.out.println("Please enter the positive number.");
        }

        int iCnt = 0;

        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println(iCnt);
        }
    }
}