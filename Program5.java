//Addition of two numbers (Two Class: Static)

import java.util.*;

class Program5
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int iFirst = sc.nextInt();

        System.out.println("Enter second number:");
        int iSecond = sc.nextInt();

        // Addition aobj = new Addition();     // in case of static no need to create the object
        // int iRet = aobj.TwoNoSum(iFirst, iSecond);

        int iRet = Addition.TwoNoSum(iFirst, iSecond);
        System.out.println("Addition of two number is: " +iRet);       
    }
}

class Addition
{
    public static int TwoNoSum(int iValue1, int iValue2)
    {
        int iResult = 0;

        iResult = iValue1 + iValue2;

        return iResult;
    }
}


/*
class Program5
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        int iFirst = sc.nextInt();
        
        System.out.println("Enter the Second Number: ");
        int iSecond = sc.nextInt();
        
        int iRet = Program5.TwoNoSum(iFirst, iSecond);
        System.out.println("Addition of two number is: "+iRet);
    }

    public static int TwoNoSum(int iFirst, int iSecond)
    {
        int iResult = iFirst + iSecond;

        return iResult;
    }
}
*/ 