// Check whether number is perfect or not (sum of factor is equal to that number, EXample: 6, 28, 496)

import java.util.*;

class Program27
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int iNo = sc.nextInt();

        Number obj = new Number();
        
        boolean bRet = obj.CheckPerfect(iNo);

        if(bRet == true)
        {
            System.out.println("Number is perfect number");
        }
        else
        {
            System.out.println("Number is not perfect number");
        }
    }
}

class Number
{
    public int SumFactors(int iValue)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (iValue/2); iCnt++)
        {
            if((iValue % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

    public boolean CheckPerfect(int iNumber)
    {
        int iResult = 0;

        iResult = SumFactors(iNumber);
        
        if(iResult == iNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}