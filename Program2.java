// Addition of two numbers 

import java.util.*;

class Program2
{
    public int Addition(int iValue1, int iValue2)        
    {
        int iResult = 0;
        iResult = iValue1 + iValue2;

        return iResult;
    }

    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int iFirst = sc.nextInt();

        System.out.println("Enter second number:");
        int iSecond = sc.nextInt();

        Program2 aobj = new Program2();     // object creation

        int iRet = aobj.Addition(iFirst, iSecond);
        System.out.println("Addition of two number is: " +iRet);
    }
}