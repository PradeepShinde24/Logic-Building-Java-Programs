// Take 2 Input like x and y from user and find the X^Y (While)

import java.util.*;

class Program46
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base value:");
        int iBase = sc.nextInt();
        
        System.out.println("Enter the power value:");
        int iPower = sc.nextInt();

        Number obj = new Number();
        long iRet = obj.CalculatePower(iBase, iPower);

        System.out.println("Asnwer is: "+iRet);
    }
}

class Number
{
    public long CalculatePower(int iBase, int iPower)
    {
        int iCnt = 0;
        long iResult = 1;
        
        if((iBase < 0) || (iPower < 0))                   // Filter
        {
            return 0;
        }

        iCnt = 1;
        while(iCnt <= iPower)
        {
            iResult = iResult * iBase;
            iCnt++;
        }
        return iResult;
    }
}