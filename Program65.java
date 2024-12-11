// Take input from user and check number is Pallindrome or not (Example: 212 7887)

import java.util.*;

class Program65
{
    public static void main(String Arg[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iNumber = sc.nextInt();

        Digit obj = new Digit();

        boolean bRet = obj.ChkPallindrome(iNumber);

        if(bRet == true)
        {
            System.out.println("Number is Pallindrome number");
        }
        else
        {
            System.out.println("Number is not Pallindrome number");
        }
    }
}

class Digit
{
    public boolean ChkPallindrome(int iNo)
    {
        int iDigit = 0;
        int iReverse = 0;
        int iTemp = iNo;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iReverse = (iReverse * 10) + iDigit;
            iNo = iNo / 10;
        }
        
        if(iReverse == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}