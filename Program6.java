// Write a program which checks whether number is even or odd.

import java.util.*;

class Program6
{
    public static void main(String Arg[])
    {
        boolean bRet = false;                    // it is same like int iRet = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sc.nextInt();

        Number obj = new Number();

        bRet = obj.ChkEven(iNo);

        if(bRet == true)
        {
            System.out.println("Number is Even number");
        }
        else
        {
            System.out.println("Number is not Even number");
        }
    }
}

class Number
{
    public boolean ChkEven(int iValue)
    {
        if((iValue % 2) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
