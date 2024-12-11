// Take input from user and sum of the digit

import java.util.*;

class Program50
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numner: ");

        int iNo = sc.nextInt();

        Digit obj = new Digit();

        int iRet = obj.SumDigits(iNo);
        System.out.print("Sum of the Digits are: "+iRet);
    }
}

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}