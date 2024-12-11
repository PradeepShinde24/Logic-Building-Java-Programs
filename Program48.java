// Take input from user and count the digit

import java.util.*;

class Program48
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numner: ");

        int iNo = sc.nextInt();

        Digit obj = new Digit();

        int iRet = obj.CountDigits(iNo);
        System.out.print("Number of Digits are: "+iRet);
    }
}

class Digit
{
    public int CountDigits(int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }
}