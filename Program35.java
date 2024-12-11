// Take 2 Input like X and Y from user and find the X^Y (With long modifier and filter and Unsigned)

import java.util.*;

class Program35
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base value:");
        int iBase = sc.nextInt();
        
        System.out.println("Enter the power value:");
        int iPower = sc.nextInt();

        Number obj = new Number();
        Unsigned long iRet = obj.CalculatePower(iBase, iPower);  // Error java has has no unsigned 

        System.out.println("Asnwer is: "+iRet);
    }
}

class Number
{
    public Unsigned long CalculatePower(int iBase, int iPower)   // Error java has has no unsigned 
    {
        int iCnt = 0;
        Unsigned long iResult = 1;                               // Error java has has no unsigned 
        
        if((iBase < 0) || (iPower < 0))              // Filter
        {
            return 0;
        }

        for(iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iResult = iResult * iBase;
        }
        return iResult;
    }
}