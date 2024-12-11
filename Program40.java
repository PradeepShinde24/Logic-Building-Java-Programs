// Take input from user and find that number Factorial

import java.util.*;

class Program40
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

        // for(iCnt = iValue; iCnt >= 1; iCnt--)
        // {
        //     iResult = iResult * iCnt;
        // }
        // return iResult;

        iCnt = iValue;
        while(iCnt >= 1)
        {
            iResult = iResult * iCnt;
            iCnt--;
        }
        return iResult;
    }
}