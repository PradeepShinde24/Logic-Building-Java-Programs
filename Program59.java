// Take two input X and Y from user and check whether Y number is present or not in X number

import java.util.*;

class Program59
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int iValue1 = sc.nextInt();

        System.out.print("Enter the Number: ");
        int iValue2 = sc.nextInt();

        Digit obj = new Digit();
        boolean bRet = obj.CheckDigit(iValue1, iValue2);

        if(bRet == true)
        {
            System.out.println("iValue2 is present in the iValue1");
        }
        else
        {
            System.out.println("iValue2 is not present in the iValue1");
        }
    }
}

class Digit
{
    public boolean CheckDigit(int iNumber, int iNo)
    {
        int iDigit = 0;

        while(iNumber != 0)
        {
            iDigit = iNumber % 10;
            if(iDigit == iNo)
            {
                break;
            }
            iNumber = iNumber / 10;
        }

        if(iDigit == iNo)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}