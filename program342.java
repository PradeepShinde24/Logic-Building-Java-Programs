// Better apporach- Take a number from user and check that number is Armstrong number or not----->Example:- 371- 3^3 + 7^3 + 1^3 = 371 | 1634- 1^4 + 6^4 + 3^4 + 4^4

import java.util.*;

class program342
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iNo = sobj.nextInt();

        Digits dobj = new Digits();
        boolean bRet = dobj.checkArmstrong(iNo);

        if(bRet == true)
        {
            System.out.println("Number is armstrong");
        }
        else
        {
            System.out.println("Number is not armstrong");
        }

    }
}

class Digits
{
    int CountDigits(int iNo)
    {
        int iCount = 0;
        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;
    }

    int Power(int X, int Y)
    {
        int iPower = 1;

        for(int iCnt = 1; iCnt <= Y; iCnt++)
        {
            iPower = iPower * X;
        }
        return iPower;
    }
    
    boolean checkArmstrong(int iNo)
    {
        int iCount = 0, iDigit = 0, iRet = 0;
        iCount = CountDigits(iNo);                  // 4 for 1634

        int iTemp = iNo;
        int iSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;                      // 4
            iSum = iSum + Power(iDigit, iCount);    // 4^4, 3^4, 6^4, 1^4
            iSum = iSum + iRet;                     // 256, 337, 1633, 1634
            iNo = iNo /10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
} 





/* 
Input : 371
3^3 + 7^3 + 1^3
27 + 373 + 1
371

*/