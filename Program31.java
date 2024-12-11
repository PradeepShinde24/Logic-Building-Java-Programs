// Take input from user to find the number is prime or not (Without Flag Method)

import java.util.*;

class Program31
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        Number obj = new Number();

        // boolean bRet = false;

        boolean bRet = obj.CheckPrime(iNo);

        if(bRet == true)
        {
            System.out.println("Number is Prime:");
        }
        else
        {
            System.out.println("Number is not Prime:");
        }

    }
}

class Number
{
    public boolean CheckPrime(int iValue)
    {
        int iCnt = 0;

        for(iCnt = 2; iCnt < (iValue/2); iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                return false;
            }
        }
        return true;
    }
}