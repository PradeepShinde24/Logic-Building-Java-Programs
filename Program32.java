// Take 2 Input like X and Y from user and find the X^Y

import java.util.*;

class Program32
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base value:");
        int iBase = sc.nextInt();
        
        System.out.println("Enter the power value:");
        int iPower = sc.nextInt();

        Number obj = new Number();
        int iRet = obj.CalculatePower(iBase, iPower);

        System.out.println("Asnwer is: "+iRet);
    }
}

class Number
{
    public int CalculatePower(int iBase, int iPower)
    {
        int iCnt = 0;
        int iResult = 1;

        for(iCnt = 1; iCnt <= iPower; iCnt++)
        {
            iResult = iResult * iBase;
        }
        return iResult;
    }
}