// Addition of two numbers

import java.util.*;

class Program4
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int iFirst = sc.nextInt();

        System.out.println("Enter second number:");
        int iSecond = sc.nextInt();

        Addition aobj = new Addition();

        int iRet = aobj.TwoNoSum(iFirst, iSecond);
        System.out.println("Addition of two number is: " +iRet);       
    }
}

class Addition
{
    public int TwoNoSum(int iValue1, int iValue2)
    {
        int iResult = 0;

        iResult = iValue1 + iValue2;

        return iResult;
    }
}

/*
class Program4
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        int iFirst = sc.nextInt();
        
        System.out.println("Enter the Second Number: ");
        int iSecond = sc.nextInt();

        Program4 obj = new Program4();
        
        int iRet = obj.TwoNoSum(iFirst, iSecond);
        System.out.println("Addition of two number is: "+iRet);
    }

    public int TwoNoSum(int iFirst, int iSecond)
    {
        int iResult = iFirst + iSecond;

        return iResult;
    }
}
*/