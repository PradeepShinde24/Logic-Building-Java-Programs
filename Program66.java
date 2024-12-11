// Take number from user and return the average of digits

import java.util.*;

class Program66
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNumber = sc.nextInt();

        Digit obj = new Digit();

        float fRet = obj.AverageDigits(iNumber);
        System.out.println("Average of the digits are: "+fRet);
    }
}

class Digit
{
    public float AverageDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        int iCount = 0;

        if(iNo<0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iCount++;
            iNo = iNo/10;
        }
        return ((float)iSum / (float) iCount);
    }
}