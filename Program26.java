// Take number from user to find the sum of factor of that number: 

import java.util.*;

class Program26
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        Number obj = new Number();

        int iRet = obj.SumFactors(iNo);
        System.out.println("Sum of the factors is: " +iRet);
    }
}

class Number
{
    public int SumFactors(int iValue)
    {
        int iCnt = 0;
        int iSum = 0;

        if(iValue < 0)               // Updater
        {
            iValue = -iValue;
        }

        for( iCnt = 1; iCnt <= iValue; iCnt++)         // Time Complexity is N 
        {
            if((iValue % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}