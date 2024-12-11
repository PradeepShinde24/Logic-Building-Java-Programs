// Take input from user and find that number Factorial (While)

import java.util.*;

class Program45
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

        iCnt = 1;
        while(iCnt <= iValue)
        {
            iResult = iResult * iCnt;
            iCnt++;
        }
        return iResult;
    }
}