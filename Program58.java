// Take Input from user and find the frequency of 8 in number

import java.util.*;

class Program58
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number:");
        int iNo = sc.nextInt();

        Digit obj = new Digit();
        int iRet = obj.Frequency(iNo);
        System.out.println("Frequency of 8 is: "+iRet);
    }
}

class Digit
{
    public int Frequency(int iNo)
    { 
        if(iNo < 0)                        // Filter
        {
            iNo = -iNo;
        }

        int iDigit = 0;
        int iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 8)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}