// Take number from user to find the factor of that number: (Normal Code)

import java.util.*;

class Program21
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        Number.DisplayFactor(iNo);
    }
}

class Number
{
    public static void DisplayFactor(int iValue)
    {
        int iCnt = 0;

        for( iCnt = 1; iCnt < iValue; iCnt++)                 // Time Complexity is O(N)
        {
            if((iValue % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}