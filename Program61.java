// Take inputs from user and count the number of Even Digit

import java.util.*;

class Program61
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNo = sc.nextInt();

        Digit obj = new Digit();

        int iRet = obj.CountEvenDigit(iNo);
        System.out.println("Number of Even Digits are: "+iRet);
    }
}

class Digit
{
    public int CountEvenDigit(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}