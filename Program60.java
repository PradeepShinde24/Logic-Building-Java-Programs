// Take two input X and Y from user and find the frequency of Y number in X number

import java.util.*;

class Program60
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int iValue1 = sc.nextInt();

        System.out.print("Enter the Number: ");
        int iValue2 = sc.nextInt();

        Digit obj = new Digit();
        int iRet = obj.Frequency(iValue1, iValue2);
        System.out.println("Frequency of iValue2 is: "+iRet);

    }
}

class Digit
{
    public int Frequency(int iNumber, int iNo)
    {
        int iDigit = 0;
        int iCount = 0;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;
            if(iDigit == iNo)
            {
                iCount++;
            }
            iNumber = iNumber / 10;
        }
        return iCount;
    }
}