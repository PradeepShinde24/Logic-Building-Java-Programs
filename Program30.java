// Take input from user to find the number is prime or not (by Flag Method)

import java.util.*;

class Program30
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        Number obj = new Number();

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
        boolean bFlag =  true;

        for(iCnt = 2; iCnt < (iValue/2); iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                bFlag = false;
                break;
            }
        }
        return bFlag;
    }
}