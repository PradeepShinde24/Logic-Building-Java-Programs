// Addition of two numbers (Static keyword)

import java.util.*;

class Program3
{
    public static int Addition(int iValue1, int iValue2)             // Here we used static keyword so we can not create the object
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

        // int iRet = Addition(iFirst, iSecond);
        int iRet = Program3.Addition(iFirst, iSecond);               // line number 25 and 26 both are same working
        System.out.println("Addition of two number is: " +iRet);
    }
}
