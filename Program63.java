// Take input from user and reverse that number

import java.util.*;

class Program63
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNumber = sc.nextInt();

        Digit obj = new Digit();

        int iRet = obj.ReverseNumber(iNumber);
        System.out.println("Reversed number: "+iRet);
    }
}

class Digit
{
    public int ReverseNumber(int iNo)
    {
        int iDigit = 0;
        int iReverse = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iReverse = (iReverse * 10) + iDigit;
            iNo = iNo / 10;
        }
        return iReverse;
    }
}