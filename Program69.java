// Take number from user and find the largest Digit

import java.util.*;

class Program69
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int iNumber = sc.nextInt();

        Digit obj = new Digit();
        int iRet = obj.largestDigit(iNumber);

        System.out.println("Largest Digit is: "+iRet);
    }
}

class Digit 
{
    public int largestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;
        }
        return iMax;
    }
}