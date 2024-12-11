// Take number from user to find the factor of that number: (Normal Code)

import java.util.*;

class Program23
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        Number obj = new Number();
        obj.DisplayFactor(iNo);
    }
}

class Number
{
    public void DisplayFactor(int iValue)
    {
        int iCnt = 0;

        System.out.println("Factors are: ");
        for( iCnt = 1; iCnt <= iValue; iCnt++)         // Time Complexity is N 
        {
            if((iValue % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}