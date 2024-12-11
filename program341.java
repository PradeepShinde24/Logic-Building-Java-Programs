// Take a number from user and check that number is Armstrong number or not----->Example:- 371- 3^3 + 7^3 + 1^3 = 371 | 1634- 1^4 + 6^4 + 3^4 + 4^4

import java.util.*;

class program341
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
    boolean checkArmstrong(int iNo)
    {
        int iTemp = iNo;
        
        // Count number of digits
        int iCount = 0;
        while(iTemp != 0)
        {
            iCount++;
            iTemp = iTemp / 10;
        }
        iTemp = iNo;

        int iSum = 0, iPower = 1, iCnt = 0, iDigit = 0;
        
        // Logic to split the number
        while(iNo != 0)
        {
            iDigit = iNo % 10;

            // Logic to calculate power
            for(iCnt = 1; iCnt <= iCount; iCnt++)
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;
            iPower = 1;
            iNo = iNo / 10;
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