// Take number from user and find the smallest Digit

import java.util.*;

class Program67
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int iNumber = sc.nextInt();

        Digit obj = new Digit();
        int iRet = obj.SmallDigit(iNumber);

        System.out.println("Smallest Digit is: "+iRet);
    }
}

class Digit 
{
    public int SmallDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 9;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNo = iNo / 10;
        }
        return iMin;
    }
}