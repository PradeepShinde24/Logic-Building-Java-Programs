// Write a program which checks whether number is divisible by 3 and 5

import java.util.*;

class Program7
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sc.nextInt();

        Number obj = new Number();

        boolean bRet = obj.Check(iNo);

        if(bRet == true)
        {
            System.out.println("Number is divisble by 3 and 5");
        }
        else
        {
            System.out.println("Number is not divisble by 3 and 5");
        }
    }
}

class Number
{
    public boolean Check(int iValue)
    {
        if((iValue % 3) == 0 && (iValue % 5) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}