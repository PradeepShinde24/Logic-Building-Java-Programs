// Take input from user and find that number Factorial (With Updater means if you take the negative input then also value is print by taking number is positive)

import java.util.*;

class Program42
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int iNo = sc.nextInt();

        Number obj = new Number();
        int iRet = obj.Factorial(iNo);

        System.out.println("Factorial of the number is: "+iRet);
        
    }
}

class Number
{
    public int Factorial(int iValue)
    {
        int iCnt = 0;
        int iResult = 1;

        if(iValue < 0)                // Updater
        {
            iValue = -iValue;
        }

        for(iCnt = iValue; iCnt >= 1; iCnt--)
        {
            iResult = iResult * iCnt;
        }
        return iResult;
    }
}